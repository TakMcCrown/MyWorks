import java.util.Scanner;

public class MainArith {
    public static void main(String[] args) {
        Arithmetic total = new Arithmetic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int oneNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int twoNumber = scanner.nextInt();
        System.out.println("Какую команду выполнить? 1 - Сумма, 2 - произведение, 3 - Макс и мин");
        int what = scanner.nextInt();
        if (what == 1) {
            total.Summ(oneNumber, twoNumber);
        } else if (what == 2) {
            total.Multi(oneNumber, twoNumber);
        } else if (what == 3) {
            total.MaxMin(oneNumber, twoNumber);
        }
    }
}
