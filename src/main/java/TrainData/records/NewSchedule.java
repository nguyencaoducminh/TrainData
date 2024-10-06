package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

public class NewSchedule {
    private String transactionClass;
    private String uic;

    public NewSchedule() {}

    public NewSchedule(String transactionClass, String uic) {
        this.transactionClass = transactionClass;
        this.uic = uic;
    }

    public String getTransactionClass() {
        return transactionClass;
    }
    @JsonSetter("traction_class")
    public void setTransactionClass(String transactionClass) {
        this.transactionClass = transactionClass;
    }

    public String getUic() {
        return uic;
    }
    @JsonSetter("uic_code")
    public void setUic(String uic) {
        this.uic = uic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewSchedule that = (NewSchedule) o;
        return Objects.equals(transactionClass, that.transactionClass) && Objects.equals(uic, that.uic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionClass, uic);
    }

    @Override
    public String toString() {
        return "NewSchedule{" +
                "transactionClass='" + transactionClass + '\'' +
                ", uic='" + uic + '\'' +
                '}';
    }
}
