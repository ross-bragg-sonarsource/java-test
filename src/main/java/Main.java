import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static java.util.Collections.singletonList;

public class Main {

  public static void main(String [] args) throws IOException, InterruptedException {

    HttpServletRequest req = new HttpServletRequest() {
      @Override
      public String getAuthType() {
        return null;
      }

      @Override
      public Cookie[] getCookies() {
        return new Cookie[0];
      }

      @Override
      public long getDateHeader(String s) {
        return 0;
      }

      @Override
      public String getHeader(String s) {
        return null;
      }

      @Override
      public Enumeration getHeaders(String s) {
        return null;
      }

      @Override
      public Enumeration getHeaderNames() {
        return null;
      }

      @Override
      public int getIntHeader(String s) {
        return 0;
      }

      @Override
      public String getMethod() {
        return null;
      }

      @Override
      public String getPathInfo() {
        return null;
      }

      @Override
      public String getPathTranslated() {
        return null;
      }

      @Override
      public String getContextPath() {
        return null;
      }

      @Override
      public String getQueryString() {
        return null;
      }

      @Override
      public String getRemoteUser() {
        return null;
      }

      @Override
      public boolean isUserInRole(String s) {
        return false;
      }

      @Override
      public Principal getUserPrincipal() {
        return null;
      }

      @Override
      public String getRequestedSessionId() {
        return null;
      }

      @Override
      public String getRequestURI() {
        return null;
      }

      @Override
      public StringBuffer getRequestURL() {
        return null;
      }

      @Override
      public String getServletPath() {
        return null;
      }

      @Override
      public HttpSession getSession(boolean b) {
        return null;
      }

      @Override
      public HttpSession getSession() {
        return null;
      }

      @Override
      public boolean isRequestedSessionIdValid() {
        return false;
      }

      @Override
      public boolean isRequestedSessionIdFromCookie() {
        return false;
      }

      @Override
      public boolean isRequestedSessionIdFromURL() {
        return false;
      }

      @Override
      public boolean isRequestedSessionIdFromUrl() {
        return false;
      }

      @Override
      public Object getAttribute(String s) {
        return null;
      }

      @Override
      public Enumeration getAttributeNames() {
        return null;
      }

      @Override
      public String getCharacterEncoding() {
        return null;
      }

      @Override
      public void setCharacterEncoding(String s) throws UnsupportedEncodingException {

      }

      @Override
      public int getContentLength() {
        return 0;
      }

      @Override
      public String getContentType() {
        return null;
      }

      @Override
      public ServletInputStream getInputStream() throws IOException {
        return null;
      }

      @Override
      public String getParameter(String s) {
        return null;
      }

      @Override
      public Enumeration getParameterNames() {
        return null;
      }

      @Override
      public String[] getParameterValues(String s) {
        return new String[0];
      }

      @Override
      public Map getParameterMap() {
        return null;
      }

      @Override
      public String getProtocol() {
        return null;
      }

      @Override
      public String getScheme() {
        return null;
      }

      @Override
      public String getServerName() {
        return null;
      }

      @Override
      public int getServerPort() {
        return 0;
      }

      @Override
      public BufferedReader getReader() throws IOException {
        return null;
      }

      @Override
      public String getRemoteAddr() {
        return null;
      }

      @Override
      public String getRemoteHost() {
        return null;
      }

      @Override
      public void setAttribute(String s, Object o) {

      }

      @Override
      public void removeAttribute(String s) {

      }

      @Override
      public Locale getLocale() {
        return null;
      }

      @Override
      public Enumeration getLocales() {
        return null;
      }

      @Override
      public boolean isSecure() {
        return false;
      }

      @Override
      public RequestDispatcher getRequestDispatcher(String s) {
        return null;
      }

      @Override
      public String getRealPath(String s) {
        return null;
      }

      @Override
      public int getRemotePort() {
        return 0;
      }

      @Override
      public String getLocalName() {
        return null;
      }

      @Override
      public String getLocalAddr() {
        return null;
      }

      @Override
      public int getLocalPort() {
        return 0;
      }
    };
    test(req);

    String password = "123";


    java.util.regex.Pattern.compile("(h|h|ih(((i|a|c|c|a|i|i|j|b|a|i|b|a|a|j))+h)ahbfhba|c|i)*").matcher(
      "hchcchicihcchciiicichhcichcihcchiihichiciiiihhcchi"+
        "cchhcihchcihiihciichhccciccichcichiihcchcihhicchcciicchcccihiiihhihihihi"+
        "chicihhcciccchihhhcchichchciihiicihciihcccciciccicciiiiiiiiicihhhiiiihchccch"+
        "chhhhiiihchihcccchhhiiiiiiiicicichicihcciciihichhhhchihciiihhiccccccciciihh"+
        "ichiccchhicchicihihccichicciihcichccihhiciccccccccichhhhihihhcchchihih"+
        "iihhihihihicichihiiiihhhhihhhchhichiicihhiiiiihchccccchichci").matches();


    test t = new test();
    t.val = 100;

    List<Integer> i = new LinkedList<>();
    i.add(1);
    i.add(2);

    Set<Integer> s = new HashSet<>();
    s.add(null);
    s.add(1);
    s.add(3);

    s.removeAll(i);

    System.out.println("s "+s);


    System.out.println(String.format("koko %s %s",new Date(), System.currentTimeMillis()));
    System.out.println(String.format("dd %s",System.currentTimeMillis()));
    System.out.println("done");
  }

  public static void test(HttpServletRequest req) throws IOException, InterruptedException {
    Long time = Long.parseLong(req.getParameter("time"));
    Thread.sleep(Math.min(time, 1000));
    // ...) {

  }
  public static boolean check(Long duration) {
    return (duration == null || duration >= 0);
  }
}
