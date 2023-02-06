public class Arithmetic {
    public int oneNumber;
    public int twoNumber;

    public Arithmetic(int oneNumber, int twoNumber) {
        this.oneNumber = oneNumber;
        this.twoNumber = twoNumber;
    }

    public Arithmetic() {
    }

    public void Summ(int oneNumber, int twoNumber) {
        int summa = oneNumber + twoNumber;
        System.out.println("Сумма чисел: " + summa);
    }

    public void Multi(int oneNumber, int twoNumber) {
        int totalMulti = oneNumber * twoNumber;
        System.out.println("Произведение чисел: " + totalMulti);
    }

    public void MaxMin(int oneNumber, int twoNumber) {
        if (oneNumber > twoNumber) {
            System.out.println("Максимальное число:" + oneNumber);
            System.out.println("Минимальное число:" + twoNumber);
        } else {
            System.out.println("Максимальное число:" + twoNumber);
            System.out.println("Минимальное число:" + oneNumber);
        }
    }
}
