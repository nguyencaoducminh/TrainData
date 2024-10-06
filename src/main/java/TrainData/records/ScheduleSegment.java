package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ScheduleSegment {
    private String trainCategory;
    private String signalId;
    private String headcode;
    private String courseId;
    private String trainServiceCode;
    private String businessSec;
    private String powerType;
    private String timingLoad;
    private String speed;
    private String operatingCharacteristics;
    private String trainClass;
    private String sleepers;
    private String reservation;
    private String connection;
    private String catering;
    private String serviceBrand;
    private ScheduleLocation[] scheduleLocation;

    public ScheduleSegment() {}

    public ScheduleSegment(String trainCategory, String signalId, String headcode, String courseId, String trainServiceCode, String businessSec, String powerType, String timingLoad, String speed, String operatingCharacteristics, String trainClass, String sleepers, String reservation, String connection, String catering, String serviceBrand, ScheduleLocation[] scheduleLocation) {
        this.trainCategory = trainCategory;
        this.signalId = signalId;
        this.headcode = headcode;
        this.courseId = courseId;
        this.trainServiceCode = trainServiceCode;
        this.businessSec = businessSec;
        this.powerType = powerType;
        this.timingLoad = timingLoad;
        this.speed = speed;
        this.operatingCharacteristics = operatingCharacteristics;
        this.trainClass = trainClass;
        this.sleepers = sleepers;
        this.reservation = reservation;
        this.connection = connection;
        this.catering = catering;
        this.serviceBrand = serviceBrand;
        this.scheduleLocation = scheduleLocation;
    }

    public String getTrainCategory() {
        return trainCategory;
    }
    @JsonSetter("CIF_train_category")
    public void setTrainCategory(String trainCategory) {
        this.trainCategory = trainCategory;
    }

    public String getSignalId() {
        return signalId;
    }
    @JsonSetter("signalling_id")
    public void setSignalId(String signalId) {
        this.signalId = signalId;
    }

    public String getHeadcode() {
        return headcode;
    }
    @JsonSetter("CIF_headcode")
    public void setHeadcode(String headcode) {
        this.headcode = headcode;
    }

    public String getCourseId() {
        return courseId;
    }
    @JsonSetter("CIF_course_indicator")
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTrainServiceCode() {
        return trainServiceCode;
    }
    @JsonSetter("CIF_train_service_code")
    public void setTrainServiceCode(String trainServiceCode) {
        this.trainServiceCode = trainServiceCode;
    }

    public String getBusinessSec() {
        return businessSec;
    }
    @JsonSetter("CIF_business_sector")
    public void setBusinessSec(String businessSec) {
        this.businessSec = businessSec;
    }

    public String getPowerType() {
        return powerType;
    }
    @JsonSetter("CIF_power_type")
    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getTimingLoad() {
        return timingLoad;
    }
    @JsonSetter("CIF_timing_load")
    public void setTimingLoad(String timingLoad) {
        this.timingLoad = timingLoad;
    }

    public String getSpeed() {
        return speed;
    }
    @JsonSetter("CIF_speed")
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getOperatingCharacteristics() {
        return operatingCharacteristics;
    }
    @JsonSetter("CIF_operating_characteristics")
    public void setOperatingCharacteristics(String operatingCharacteristics) {
        this.operatingCharacteristics = operatingCharacteristics;
    }

    public String getTrainClass() {
        return trainClass;
    }
    @JsonSetter("CIF_train_class")
    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public String getSleepers() {
        return sleepers;
    }
    @JsonSetter("CIF_sleepers")
    public void setSleepers(String sleepers) {
        this.sleepers = sleepers;
    }

    public String getReservation() {
        return reservation;
    }
    @JsonSetter("CIF_reservations")
    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getConnection() {
        return connection;
    }
    @JsonSetter("CIF_connection_indicator")
    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getCatering() {
        return catering;
    }
    @JsonSetter("CIF_catering_code")
    public void setCatering(String catering) {
        this.catering = catering;
    }

    public String getServiceBrand() {
        return serviceBrand;
    }
    @JsonSetter("CIF_service_branding")
    public void setServiceBrand(String serviceBrand) {
        this.serviceBrand = serviceBrand;
    }

    public ScheduleLocation[] getScheduleLocation() {
        return scheduleLocation;
    }
    @JsonSetter("schedule_location")
    public void setScheduleLocation(ScheduleLocation[] scheduleLocation) {
        this.scheduleLocation = scheduleLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleSegment that = (ScheduleSegment) o;
        return Objects.equals(trainCategory, that.trainCategory) && Objects.equals(signalId, that.signalId) && Objects.equals(headcode, that.headcode) && Objects.equals(courseId, that.courseId) && Objects.equals(trainServiceCode, that.trainServiceCode) && Objects.equals(businessSec, that.businessSec) && Objects.equals(powerType, that.powerType) && Objects.equals(timingLoad, that.timingLoad) && Objects.equals(speed, that.speed) && Objects.equals(operatingCharacteristics, that.operatingCharacteristics) && Objects.equals(trainClass, that.trainClass) && Objects.equals(sleepers, that.sleepers) && Objects.equals(reservation, that.reservation) && Objects.equals(connection, that.connection) && Objects.equals(catering, that.catering) && Objects.equals(serviceBrand, that.serviceBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainCategory, signalId, headcode, courseId, trainServiceCode, businessSec, powerType, timingLoad, speed, operatingCharacteristics, trainClass, sleepers, reservation, connection, catering, serviceBrand);
    }

    @Override
    public String toString() {
        return "ScheduleSegment{" +
                "trainCategory='" + trainCategory + '\'' +
                ", signalId='" + signalId + '\'' +
                ", headcode='" + headcode + '\'' +
                ", courseId='" + courseId + '\'' +
                ", trainServiceCode='" + trainServiceCode + '\'' +
                ", businessSec='" + businessSec + '\'' +
                ", powerType='" + powerType + '\'' +
                ", timingLoad='" + timingLoad + '\'' +
                ", speed='" + speed + '\'' +
                ", operatingCharacteristics='" + operatingCharacteristics + '\'' +
                ", trainClass='" + trainClass + '\'' +
                ", sleepers='" + sleepers + '\'' +
                ", reservation='" + reservation + '\'' +
                ", connection='" + connection + '\'' +
                ", catering='" + catering + '\'' +
                ", serviceBrand='" + serviceBrand + '\'' +
                '}';
    }
}
