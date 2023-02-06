package practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome = LocalDate.now();
    LocalDate today = LocalDate.now();

    @Override
    public void take(double amountToTake) {
        if (amountToTake > getAmount()) {
            System.out.println("Сумма больше, которая имеется на счете");
        } else {
            if (lastIncome.until(today, ChronoUnit.DAYS) > 30){
                money -= money - amountToTake;
            } else {
                System.out.println("Вы уже снимали деньги в этом месяце");
            }
        }
        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
    }

}
