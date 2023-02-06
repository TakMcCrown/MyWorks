package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      String regex = "[^0-9]";
      String word = "";
      input = input.replaceAll(regex, "");
      if (input.length() == 11 && (input.charAt(0) != '7' && input.charAt(0) != '8')){
        System.out.println("Неверный формат номера");
      } else {
        if (input.length() < 12 && input.length() > 9) {
          if (input.charAt(0) != '7' && input.charAt(0) == '9') {
            input = "7" + input;
            System.out.println(input);
          } else {
            for (int i = 1; i < input.length(); i++) {
              word = word + input.charAt(i);
            }
            input = "7" + word;
            System.out.println(input);
          }
        } else {
          System.out.println("Неверный формат номера");
        }
      }
      // TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

}
