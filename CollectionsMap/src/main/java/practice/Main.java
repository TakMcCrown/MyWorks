package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду");
            String text = scanner.nextLine();
            if (text.contains("LIST")) {
                phoneBook.getAllContacts();
            } else {
                if (phoneBook.checkName(text)) {
                    System.out.println("Введите номер телефона для абонента " + text);
                    String phone = scanner.nextLine();
                    phoneBook.addContact(phone, text);
                } else if (phoneBook.checkPhone(text)) {
                    System.out.println("Введите имя абонента для номера " + text);
                    String name = scanner.nextLine();
                    phoneBook.addContact(text, name);
                } else {
                    System.out.println("Неверный формат ввода");
                }
                /*
                * System.out.println("Введите имя абонента для номера " + phone);
            String name1 = scanner.nextLine();
            if (checkName(name1)) {
                phone2name.put(phone, name1);
                System.out.println("Контакт сохранен");
            } else {
                System.out.println("Неверный формат ввода");
            }
                * */
            }
        }
    }
}
