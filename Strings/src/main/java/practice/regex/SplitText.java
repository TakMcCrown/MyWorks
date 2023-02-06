package practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  SplitText {

  public static void main(String[] args) {
    System.out.println("Введите текст:");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String newText = "";
    String regex = "[^,.;0-9\\s]+";
    Pattern pattern = Pattern.compile((regex));
    Matcher matcher = pattern.matcher(text);
    boolean a = matcher.find();
    while (a) {
      int start = matcher.start();
      int end = matcher.end();
      newText = newText + text.substring(start, end);
      if (matcher.find()) {
        newText = newText + System.lineSeparator();
      } else {
        a = false;
      }
    }
    return newText;
  }

}