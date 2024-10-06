package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

public class Association {
    private String transactionType;
    private String mainTrainUid;
    private String assocTrainUid;
    private String startDate;
    private String endDate;
    private String days;
    private String category;
    private String dateIndicator;
    private String location;
    private String baseSuffix;
    private String assocSuffix;
    private String diagram;
    private String stp;

    public Association() {}

    public Association(String transactionType, String mainTrainUid, String assocTrainUid, String startDate, String endDate, String days, String category, String dateIndicator, String location, String baseSuffix, String assocSuffix, String diagram, String stp) {
        this.transactionType = transactionType;
        this.mainTrainUid = mainTrainUid;
        this.assocTrainUid = assocTrainUid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.days = days;
        this.category = category;
        this.dateIndicator = dateIndicator;
        this.location = location;
        this.baseSuffix = baseSuffix;
        this.assocSuffix = assocSuffix;
        this.diagram = diagram;
        this.stp = stp;
    }

    public String getTransactionType() {
        return transactionType;
    }
    @JsonSetter("transaction_type")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getMainTrainUid() {
        return mainTrainUid;
    }
    @JsonSetter("main_train_uid")
    public void setMainTrainUid(String mainTrainUid) {
        this.mainTrainUid = mainTrainUid;
    }

    public String getAssocTrainUid() {
        return assocTrainUid;
    }
    @JsonSetter("assoc_train_uid")
    public void setAssocTrainUid(String assocTrainUid) {
        this.assocTrainUid = assocTrainUid;
    }

    public String getStartDate() {
        return startDate;
    }
    @JsonSetter("assoc_start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    @JsonSetter("assoc_end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDays() {
        return days;
    }
    @JsonSetter("assoc_days")
    public void setDays(String days) {
        this.days = days;
    }

    public String getCategory() {
        return category;
    }
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateIndicator() {
        return dateIndicator;
    }
    @JsonSetter("date_indicator")
    public void setDateIndicator(String dateIndicator) {
        this.dateIndicator = dateIndicator;
    }

    public String getLocation() {
        return location;
    }
    @JsonSetter("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public String getBaseSuffix() {
        return baseSuffix;
    }
    @JsonSetter("base_location_suffix")
    public void setBaseSuffix(String baseSuffix) {
        this.baseSuffix = baseSuffix;
    }

    public String getAssocSuffix() {
        return assocSuffix;
    }
    @JsonSetter("assoc_location_suffix")
    public void setAssocSuffix(String assocSuffix) {
        this.assocSuffix = assocSuffix;
    }

    public String getDiagram() {
        return diagram;
    }
    @JsonSetter("diagram_type")
    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public String getStp() {
        return stp;
    }
    @JsonSetter("CIF_stp_indicator")
    public void setStp(String stp) {
        this.stp = stp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Association that = (Association) o;
        return Objects.equals(transactionType, that.transactionType) &&
                Objects.equals(mainTrainUid, that.mainTrainUid) &&
                Objects.equals(assocTrainUid, that.assocTrainUid) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(days, that.days) &&
                Objects.equals(category, that.category) &&
                Objects.equals(dateIndicator, that.dateIndicator) &&
                Objects.equals(location, that.location) &&
                Objects.equals(baseSuffix, that.baseSuffix) &&
                Objects.equals(assocSuffix, that.assocSuffix) &&
                Objects.equals(diagram, that.diagram) &&
                Objects.equals(stp, that.stp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionType, mainTrainUid, assocTrainUid, startDate, endDate, days, category, dateIndicator, location, baseSuffix, assocSuffix, diagram, stp);
    }

    @Override
    public String toString() {
        return "Association{" +
                "transactionType='" + transactionType + '\'' +
                ", mainTrainUid='" + mainTrainUid + '\'' +
                ", assocTrainUid='" + assocTrainUid + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", days='" + days + '\'' +
                ", category='" + category + '\'' +
                ", dateIndicator='" + dateIndicator + '\'' +
                ", location='" + location + '\'' +
                ", baseSuffix='" + baseSuffix + '\'' +
                ", assocSuffix='" + assocSuffix + '\'' +
                ", diagram='" + diagram + '\'' +
                ", stp='" + stp + '\'' +
                '}';
    }
}
