package practice;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        if (amountToTake > getAmount()) {
            System.out.println("Сумма больше, которая имеется на счете");
        } else {
            System.out.println(money);
            money -= (amountToTake + (1.0 * (1.0 / 100.0) * amountToTake));
        }
        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
