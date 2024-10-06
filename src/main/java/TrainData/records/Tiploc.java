package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

public class Tiploc {
    private String transactionType;
    private String tiplocCode;
    private String nalco;
    private String stanox;
    private String crsCode;
    private String description;
    private String tpsDescription;

    public Tiploc() {}

    public Tiploc(String transactionType, String tiplocCode, String nalco, String stanox, String crsCode, String description, String tpsDescription) {
        this.transactionType = transactionType;
        this.tiplocCode = tiplocCode;
        this.nalco = nalco;
        this.stanox = stanox;
        this.crsCode = crsCode;
        this.description = description;
        this.tpsDescription = tpsDescription;
    }

    public String getTransactionType() {
        return transactionType;
    }
    @JsonSetter("transaction_type")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTiplocCode() {
        return tiplocCode;
    }
    @JsonSetter("tiploc_code")
    public void setTiplocCode(String tiplocCode) {
        this.tiplocCode = tiplocCode;
    }

    public String getNalco() {
        return nalco;
    }
    @JsonSetter("nalco")
    public void setNalco(String nalco) {
        this.nalco = nalco;
    }

    public String getStanox() {
        return stanox;
    }
    @JsonSetter("stanox")
    public void setStanox(String stanox) {
        this.stanox = stanox;
    }

    public String getCrsCode() {
        return crsCode;
    }
    @JsonSetter("crs_code")
    public void setCrsCode(String crsCode) {
        this.crsCode = crsCode;
    }

    public String getDescription() {
        return description;
    }
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTpsDescription() {
        return tpsDescription;
    }
    @JsonSetter("tps_description")
    public void setTpsDescription(String tpsDescription) {
        this.tpsDescription = tpsDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiploc tiploc = (Tiploc) o;
        return Objects.equals(transactionType, tiploc.transactionType) &&
                Objects.equals(tiplocCode, tiploc.tiplocCode) &&
                Objects.equals(nalco, tiploc.nalco) &&
                Objects.equals(stanox, tiploc.stanox) &&
                Objects.equals(crsCode, tiploc.crsCode) &&
                Objects.equals(description, tiploc.description) &&
                Objects.equals(tpsDescription, tiploc.tpsDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionType, tiplocCode, nalco, stanox, crsCode, description, tpsDescription);
    }

    @Override
    public String toString() {
        return "Tiploc{" +
                "transactionType='" + transactionType + '\'' +
                ", tiplocCode='" + tiplocCode + '\'' +
                ", nalco='" + nalco + '\'' +
                ", stanox='" + stanox + '\'' +
                ", crsCode='" + crsCode + '\'' +
                ", description='" + description + '\'' +
                ", tpsDescription='" + tpsDescription + '\'' +
                '}';
    }
}
