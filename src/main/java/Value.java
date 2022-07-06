
import com.google.gson.annotations.SerializedName;
public class Value {

  @SerializedName("text")
  private final String text;

  @SerializedName("href")
  private final String href;

  public Value(String text, String href) {
    this.text = text;
    this.href = href;
  }
}
