package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 14;
        int month = 11;
        int year = 2019;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        int until = (int) birthday.until(today, ChronoUnit.YEARS) + 1;
        String text = "";
        if (birthday.isBefore(today)) {
            for (int i = 0; i < until; i++) {
                text = text + i + " - " + formatter.format(birthday.plusYears(i)) + System.lineSeparator();
            }
            return text;
        } else if (birthday.isAfter(today)) {
            System.out.println("");
        } else if (birthday.compareTo(today) == 0) {
            return "0 - " + formatter.format(today);
        }

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return "";
    }
}
