package home.work5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

  public static void main(String[] args) {
    String s ="asfasdfsdfg";
    Pattern pattern = Pattern.compile("[0-9]");
    Matcher matcher = pattern.matcher(s);

    System.out.println(matcher.find());
  }
}
