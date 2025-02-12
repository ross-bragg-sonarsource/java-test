import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Main4 {
  private static final Pattern EMAIL_PATTERN = Pattern.compile("<(\\S*?)>");
  private static final String AUTHOR_EMAIL = "author-mail ";

  public static void main(String [] args) {


    Matcher matcher = EMAIL_PATTERN.matcher("author-mail koko");
    if (!matcher.find(AUTHOR_EMAIL.length()) || matcher.groupCount() != 1) {
      throw new IllegalStateException("Couldn't parse author email from: ");
    }
  }

}
