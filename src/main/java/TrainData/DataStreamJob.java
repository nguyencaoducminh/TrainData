package TrainData;

import TrainData.records.Association;
import TrainData.records.Schedule;
import TrainData.records.Tiploc;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.connector.base.DeliveryGuarantee;
import org.apache.flink.connector.kafka.sink.KafkaRecordSerializationSchema;
import org.apache.flink.connector.kafka.sink.KafkaSink;
import org.apache.flink.core.fs.Path;
import org.apache.flink.formats.json.JsonSerializationSchema;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.connector.file.src.FileSource;
import org.apache.flink.connector.file.src.reader.TextLineInputFormat;

public class DataStreamJob {

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		FileSource<String> rawSource =
				FileSource.forRecordStreamFormat(
						new TextLineInputFormat(),
						new Path("file:///" + System.getProperty("user.home") + "/Downloads/toc-full")
				).build();

		DataStream<String> rawStream = env.fromSource(rawSource, WatermarkStrategy.noWatermarks(), "File Source");

		DataStream<Tiploc> tiploc = rawStream
				.filter(line -> line.startsWith("{\"Tiploc"))
				.map(line -> new ObjectMapper().readValue(line.substring(12, line.length()-1), Tiploc.class));;

		DataStream<Association> association = rawStream
				.filter(line -> line.startsWith("{\"JsonAs"))
				.map(line -> new ObjectMapper().readValue(line.substring(21, line.length()-1), Association.class));

		DataStream<Schedule> schedules = rawStream
				.filter(line -> line.startsWith("{\"JsonSc"))
				.map(line -> new ObjectMapper().readValue(line.substring(18, line.length()-1), Schedule.class));

		KafkaRecordSerializationSchema<Tiploc> tiplocSerializer = KafkaRecordSerializationSchema.<Tiploc>builder()
				.setTopic("tiploc")
				.setValueSerializationSchema(new JsonSerializationSchema<>())
				.build();

		KafkaSink<Tiploc> tiplocSink = KafkaSink.<Tiploc>builder()
				.setBootstrapServers("localhost:9092")
				.setRecordSerializer(tiplocSerializer)
				.setDeliveryGuarantee(DeliveryGuarantee.EXACTLY_ONCE).build();

		KafkaRecordSerializationSchema<Association> associationSerializer = KafkaRecordSerializationSchema.<Association>builder()
				.setTopic("association")
				.setValueSerializationSchema(new JsonSerializationSchema<>())
				.build();

		KafkaSink<Association> associationSink = KafkaSink.<Association>builder()
				.setBootstrapServers("localhost:9092")
				.setRecordSerializer(associationSerializer)
				.setDeliveryGuarantee(DeliveryGuarantee.EXACTLY_ONCE).build();

		KafkaRecordSerializationSchema<Schedule> scheduleSerializer = KafkaRecordSerializationSchema.<Schedule>builder()
				.setTopic("schedule")
				.setValueSerializationSchema(new JsonSerializationSchema<>())
				.build();

		KafkaSink<Schedule> scheduleSink = KafkaSink.<Schedule>builder()
				.setBootstrapServers("localhost:9092")
				.setRecordSerializer(scheduleSerializer)
				.setDeliveryGuarantee(DeliveryGuarantee.EXACTLY_ONCE).build();

		tiploc.sinkTo(tiplocSink);
		association.sinkTo(associationSink);
		schedules.sinkTo(scheduleSink);

		env.execute("Train Data Batch Job");
	}
}
