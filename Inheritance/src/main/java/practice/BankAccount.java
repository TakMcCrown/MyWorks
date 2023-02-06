package practice;

public class BankAccount {

  protected double money;

  public double getAmount() {
    //TODO: реализуйте метод и удалите todo
    // верните значение количества денег не счету
    return money;
  }

  public final void put(double amountToPut) {
    if (amountToPut > 0) {
      money += amountToPut;
    } else {
      System.out.println("Нельзя занести отрицательную сумму");
    }
    //TODO: реализуйте метод и удалите todo
    // метод зачисляет деньги на счет
  }

  public void take(double amountToTake) {
    if (amountToTake > getAmount()) {
      System.out.println("Сумма больше, которая имеется на счете");
    } else {
      money -= money - amountToTake;
    }
    //TODO: реализуйте метод и удалите todo
    // метод списывает деньги со счета
  }
}
