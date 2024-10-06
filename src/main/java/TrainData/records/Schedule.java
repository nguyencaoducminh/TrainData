package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Schedule {
    private String CIFTrainUid;
    private String transactionType;
    private String startDate;
    private String endDate;
    private String days;
    private String CIFBankHoliday;
    private String trainStatus;
    private String stp;
    private String atoc;
    private String timetable;
    private ScheduleSegment scheduleSegment;
    private NewSchedule newSchedule;

    public Schedule() {}

    public Schedule(String CIFTrainUid, String transactionType, String startDate, String endDate, String days, String CIFBankHoliday, String trainStatus, String stp, String atoc, String timetable, ScheduleSegment scheduleSegment, NewSchedule newSchedule) {
        this.CIFTrainUid = CIFTrainUid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.days = days;
        this.CIFBankHoliday = CIFBankHoliday;
        this.trainStatus = trainStatus;
        this.stp = stp;
        this.atoc = atoc;
        this.timetable = timetable;
        this.scheduleSegment = scheduleSegment;
        this.newSchedule = newSchedule;
    }

    public String getCIFTrainUid() {
        return CIFTrainUid;
    }
    @JsonSetter("CIF_train_uid")
    public void setCIFTrainUid(String CIFTrainUid) {
        this.CIFTrainUid = CIFTrainUid;
    }

    public String getTransactionType() {
        return transactionType;
    }
    @JsonSetter("transaction_type")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getStartDate() {
        return startDate;
    }
    @JsonSetter("schedule_start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    @JsonSetter(" schedule_end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDays() {
        return days;
    }
    @JsonSetter("schedule_days_runs")
    public void setDays(String days) {
        this.days = days;
    }

    public String getCIFBankHoliday() {
        return CIFBankHoliday;
    }
    @JsonSetter("CIF_bank_holiday_running")
    public void setCIFBankHoliday(String CIFBankHoliday) {
        this.CIFBankHoliday = CIFBankHoliday;
    }

    public String getTrainStatus() {
        return trainStatus;
    }
    @JsonSetter("train_status")
    public void setTrainStatus(String trainStatus) {
        this.trainStatus = trainStatus;
    }

    public String getStp() {
        return stp;
    }
    @JsonSetter("CIF_stp_indicator")
    public void setStp(String stp) {
        this.stp = stp;
    }

    public String getAtoc() {
        return atoc;
    }
    @JsonSetter("atoc_code")
    public void setAtoc(String atoc) {
        this.atoc = atoc;
    }

    public String getTimetable() {
        return timetable;
    }
    @JsonSetter("applicable_timetable")
    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public ScheduleSegment getScheduleSegment() {
        return scheduleSegment;
    }
    @JsonSetter("schedule_segment")
    public void setScheduleSegment(ScheduleSegment scheduleSegment) {
        this.scheduleSegment = scheduleSegment;
    }

    public NewSchedule getNewSchedule() {
        return newSchedule;
    }
    @JsonSetter("new_schedule_segment")
    public void setNewSchedule(NewSchedule newSchedule) {
        this.newSchedule = newSchedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(CIFTrainUid, schedule.CIFTrainUid) &&
                Objects.equals(startDate, schedule.startDate) &&
                Objects.equals(endDate, schedule.endDate) &&
                Objects.equals(days, schedule.days) &&
                Objects.equals(CIFBankHoliday, schedule.CIFBankHoliday) &&
                Objects.equals(trainStatus, schedule.trainStatus) &&
                Objects.equals(stp, schedule.stp) &&
                Objects.equals(atoc, schedule.atoc) &&
                Objects.equals(timetable, schedule.timetable) &&
                Objects.equals(scheduleSegment, schedule.scheduleSegment) &&
                Objects.equals(newSchedule, schedule.newSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CIFTrainUid, startDate, endDate, days, CIFBankHoliday, trainStatus, stp, atoc, timetable, scheduleSegment, newSchedule);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "CIFTrainUid='" + CIFTrainUid + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", days='" + days + '\'' +
                ", CIFBankHoliday='" + CIFBankHoliday + '\'' +
                ", trainStatus='" + trainStatus + '\'' +
                ", stp='" + stp + '\'' +
                ", atoc='" + atoc + '\'' +
                ", timetable='" + timetable + '\'' +
                ", scheduleSegment=" + scheduleSegment +
                ", newSchedule=" + newSchedule +
                '}';
    }
}
