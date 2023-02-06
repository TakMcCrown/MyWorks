package practice;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        while (true) {
            System.out.println("Введите действие, которое нужно сделать: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            String[] word = text.split("\\s+");
            StringJoiner joiner = new StringJoiner(" ");
            StringJoiner joinerIndex = new StringJoiner(" ");
            for (int i = 1; i < word.length; i++) {
                joiner.add(word[i]);
            }
            for (int i = 2; i < word.length; i++) {
                joinerIndex.add(word[i]);
            }
            if (word[0].equals("ADD")) {
                if (word[1].matches("[-+]?\\d")) {
                    todoList.add(Integer.parseInt(word[1]), joinerIndex.toString());
                } else {
                    todoList.add(joiner.toString());
                }
            } else if (word[0].equals("DELETE")) {
                if (word[1].matches("[-+]?\\d")) {
                    todoList.delete(Integer.parseInt(word[1]));
                } else {
                    System.out.println("Возможно ввести только число");
                }
            } else if (word[0].equals("LIST")) {
                todoList.getTodos();
            } else if (word[0].equals("EDIT")) {
                if (word[1].matches("[-+]?\\d")) {
                        todoList.edit(Integer.parseInt(word[1]), joinerIndex.toString());
                    }
            }
        }
    }
}
