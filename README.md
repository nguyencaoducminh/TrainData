# Train Data project

## Dependencies
- java 11
- flink 1.19.1
- maven 3.9.9
- kafka 2.13

## How to run
1. Clone this repo
2. Download dependencies
3. Set up the dataset
   - Download dataset from [Open Rail Data API](https://publicdatafeeds.networkrail.co.uk/ntrod/CifFileAuthenticate?type=CIF_ALL_FULL_DAILY&day=toc-full)
   - Move and extract the dataset to $USERS_HOME/Downloads
4. Start flink cluster
```bash
{$Path_To_Flink_bin}/start-cluster.sh
```
5. Build the project
```bash
# In the project root run
mvn clean package
```
6. Start Kafka server
7. Create 3 Kafka topics: `association`, `schedule` and `tiploc`
8. Run the job
```bash
# In the project root run
{$Path_To_Flink_bin}/flink run ./target/TrainData-1.0-SNAPSHOT.jar
```
9. See the results in the console
```bash
# In Kafka root
bin/kafka-console-consumer.sh --topic {TOPIC_WANT_TO_SEE} --from-beginning --bootstrap-server localhost:9092
```