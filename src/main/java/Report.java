
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Report {

  public enum Result {
    PASSED("PASSED"), FAILED("FAILED");

    private final String name;

    Result(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  @SerializedName("title")
  private final String title;

  @SerializedName("details")
  private final String details;

  @SerializedName("report_type")
  private final String reportType;

  @SerializedName("reporter")
  private final String reporter;

  @SerializedName("result")
  private final String result;

  @SerializedName("link")
  private final String link;

  @SerializedName("logo_url")
  private final String logoUrl;

  @SerializedName("data")
  private final List<ReportData> data;

  public Report(String details, Result result, String logoUrl, String overviewUrl, List<ReportData> data, String projectName) {
    if (projectName == null) {
      this.title = "SonarCloud Code Analysis";
    } else {
      this.title = "SonarCloud - " + projectName;
    }
    this.reporter = "SonarCloud";
    this.reportType = "BUG";
    this.details = details;
    this.result = result.getName();
    this.logoUrl = logoUrl;
    this.link = overviewUrl;
    this.data = data;
  }

  public Report(String details, Result result, String logoUrl, String overviewUrl, List<ReportData> data) {
    this(details, result, logoUrl, overviewUrl, data, null);
  }

  public String getTitle() {
    return title;
  }

  public String getDetails() {
    return details;
  }

  public String getReportType() {
    return reportType;
  }

  public String getReporter() {
    return reporter;
  }

  public String getResult() {
    return result;
  }

  public String getLink() {
    return link;
  }

  public String getLogoUrl() {
    return logoUrl;
  }

  public List<ReportData> getData() {
    return data;
  }

  public static class ReportData {

    private enum DataType {
      NUMBER("NUMBER"), LINK("LINK"), TEXT("TEXT");

      private final String name;

      DataType(String name) {
        this.name = name;
      }

      public String getName() {
        return name;
      }
    }

    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final String type;
    @SerializedName("value")
    private final Object value;

    public ReportData(String title, int value) {
      this.type = DataType.NUMBER.name;
      this.title = title;
      this.value = value;
    }

    public ReportData(String title, String text, String href) {
      this.type = DataType.LINK.name;
      this.title = title;
      Value v = new Value(text, href);
      this.value = v;
    }

    public ReportData(String title, String text) {
      this.type = DataType.TEXT.name;
      this.title = title;
      this.value = text;
    }

    public String getTitle() {
      return title;
    }

    public Object getValue() {
      return value;
    }
  }
}
