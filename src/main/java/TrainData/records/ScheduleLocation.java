package TrainData.records;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ScheduleLocation {
    private String recordId;
    private String tiploc;
    private String tiplocInstance;
    private String arrival;
    private String departure;
    private String pass;
    private String publicArrival;
    private String publicDeparture;
    private String platform;
    private String line;
    private String path;
    private String engineeringAllowance;
    private String pathingAllowance;
    private String performanceAllowance;
    private String locationType;

    public ScheduleLocation() {}

    public ScheduleLocation(String recordId, String tiploc, String tiplocInstance, String arrival, String departure, String pass, String publicArrival, String publicDeparture, String platform, String line, String path, String engineeringAllowance, String pathingAllowance, String performanceAllowance, String locationType) {
        this.recordId = recordId;
        this.tiploc = tiploc;
        this.tiplocInstance = tiplocInstance;
        this.arrival = arrival;
        this.departure = departure;
        this.pass = pass;
        this.publicArrival = publicArrival;
        this.publicDeparture = publicDeparture;
        this.platform = platform;
        this.line = line;
        this.path = path;
        this.engineeringAllowance = engineeringAllowance;
        this.pathingAllowance = pathingAllowance;
        this.performanceAllowance = performanceAllowance;
        this.locationType = locationType;
    }

    public String getRecordId() {
        return recordId;
    }
    @JsonSetter("record_identity")
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getTiploc() {
        return tiploc;
    }
    @JsonSetter("tiploc_code")
    public void setTiploc(String tiploc) {
        this.tiploc = tiploc;
    }

    public String getTiplocInstance() {
        return tiplocInstance;
    }
    @JsonSetter("tiploc_instance")
    public void setTiplocInstance(String tiplocInstance) {
        this.tiplocInstance = tiplocInstance;
    }

    public String getArrival() {
        return arrival;
    }
    @JsonSetter("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }
    @JsonSetter("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getPass() {
        return pass;
    }
    @JsonSetter("pass")
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPublicArrival() {
        return publicArrival;
    }
    @JsonSetter("public_arrival")
    public void setPublicArrival(String publicArrival) {
        this.publicArrival = publicArrival;
    }

    public String getPublicDeparture() {
        return publicDeparture;
    }
    @JsonSetter("public_departure")
    public void setPublicDeparture(String publicDeparture) {
        this.publicDeparture = publicDeparture;
    }

    public String getPlatform() {
        return platform;
    }
    @JsonSetter("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getLine() {
        return line;
    }
    @JsonSetter("line")
    public void setLine(String line) {
        this.line = line;
    }

    public String getPath() {
        return path;
    }
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    public String getEngineeringAllowance() {
        return engineeringAllowance;
    }
    @JsonSetter("engineering_allowance")
    public void setEngineeringAllowance(String engineeringAllowance) {
        this.engineeringAllowance = engineeringAllowance;
    }

    public String getPathingAllowance() {
        return pathingAllowance;
    }
    @JsonSetter("pathing_allowance")
    public void setPathingAllowance(String pathingAllowance) {
        this.pathingAllowance = pathingAllowance;
    }

    public String getPerformanceAllowance() {
        return performanceAllowance;
    }
    @JsonSetter("performance_allowance")
    public void setPerformanceAllowance(String performanceAllowance) {
        this.performanceAllowance = performanceAllowance;
    }

    public String getLocationType() {
        return locationType;
    }
    @JsonSetter("location_type")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleLocation that = (ScheduleLocation) o;
        return Objects.equals(recordId, that.recordId) && Objects.equals(tiploc, that.tiploc) && Objects.equals(tiplocInstance, that.tiplocInstance) && Objects.equals(arrival, that.arrival) && Objects.equals(departure, that.departure) && Objects.equals(pass, that.pass) && Objects.equals(publicArrival, that.publicArrival) && Objects.equals(publicDeparture, that.publicDeparture) && Objects.equals(platform, that.platform) && Objects.equals(line, that.line) && Objects.equals(path, that.path) && Objects.equals(engineeringAllowance, that.engineeringAllowance) && Objects.equals(pathingAllowance, that.pathingAllowance) && Objects.equals(performanceAllowance, that.performanceAllowance) && Objects.equals(locationType, that.locationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, tiploc, tiplocInstance, arrival, departure, pass, publicArrival, publicDeparture, platform, line, path, engineeringAllowance, pathingAllowance, performanceAllowance, locationType);
    }

    @Override
    public String toString() {
        return "ScheduleLocation{" +
                "recordId='" + recordId + '\'' +
                ", tiploc='" + tiploc + '\'' +
                ", tiplocInstance='" + tiplocInstance + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", pass='" + pass + '\'' +
                ", publicArrival='" + publicArrival + '\'' +
                ", publicDeparture='" + publicDeparture + '\'' +
                ", platform='" + platform + '\'' +
                ", line='" + line + '\'' +
                ", path='" + path + '\'' +
                ", engineeringAllowance='" + engineeringAllowance + '\'' +
                ", pathingAllowance='" + pathingAllowance + '\'' +
                ", performanceAllowance='" + performanceAllowance + '\'' +
                ", locationType='" + locationType + '\'' +
                '}';
    }
}
