package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        int trucks = 0;
        int containers = 0;
        int boxesInContainer = 27;
        int containersInTruck = 12;

        if (boxes == 0) {
            System.out.println("");
        } else {
            containers++;
            trucks++;
            System.out.println("Грузовик: " + trucks + System.lineSeparator() +
                    "\tКонтейнер: " + containers);
        }

        for (int i = 1; i <= boxes; i++) {
            System.out.println("\t\tЯщик: " + i);

            if (i % (boxesInContainer * containersInTruck) == 0) {
                trucks++;
                System.out.println("Грузовик: " + trucks);
            }
            if (i % boxesInContainer == 0) {
                if (i != boxes) {
                    containers++;
                    System.out.println("\tКонтейнер: " + containers);
                }
            }
        }
        System.out.println("Необходимо:" + System.lineSeparator() +
                "грузовиков - " + trucks + " шт." + System.lineSeparator() +
                "контейнеров - " + containers + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
