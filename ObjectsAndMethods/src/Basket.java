public class Basket {

    private static int count = 0;
    private static double weight = 0;
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;
    public static int generalTotalPrice = 0;
    public static int generalTotalAmount = 0;
    public static int aveAllTotalPrice = 0;
    public static int avePriceBasket = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static void addAmount(int count) {
        generalTotalAmount = generalTotalAmount + count;
    }

    public static int getGeneralTotalAmount() {
        return generalTotalAmount;
    }

    public  static void addTotalPrice(int price, int count) {
        generalTotalPrice = generalTotalPrice + price * count;
    }

    public static int getGeneralTotalPrice() {
        return generalTotalPrice;
    }

    public static void averageTotalPrice() {
        aveAllTotalPrice = Basket.getGeneralTotalPrice() / Basket.getGeneralTotalAmount();
    }

    public static int getAveAllTotalPrice() {
        return aveAllTotalPrice;
    }

    public static void averagePriceBasket() {
        avePriceBasket = Basket.getGeneralTotalPrice() / Basket.getCount();
    }

    public static int getAvePriceBasket() {
        return avePriceBasket;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + weight+ " кг. -  " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        Basket.addAmount(count);
        Basket.addTotalPrice(price, count);
        Basket.averageTotalPrice();
        Basket.averagePriceBasket();
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Вес корзины: " + getTotalWeight());
            System.out.println("Стоимость корзины: " + getTotalPrice());
        }
    }
}
