public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        basket.add("Молоко", 40, 1, 1);
        basket.add("Кола", 60, 2, 0.5);
        basket.add("Чипсы", 50, 5, 0.2);

        basket1.add("Апельсины", 20, 4, 0.3);
        basket1.add("Яблоки", 30, 6, 0.7);

        basket2.add("Виски", 1000, 1, 1);
        basket2.add("Пиво", 60, 4, 2);

        basket.print("Корзина 1");
        basket1.print("Корзина 2");
        basket2.print("Корзина 3");
        System.out.println("Количество товаров во всех корзинах: " + Basket.getGeneralTotalAmount());
        System.out.println("Общая стоимость товаров во всех корзинах: " + Basket.getGeneralTotalPrice());
        System.out.println("Средная цена товаров со всех корзин: " + Basket.getAveAllTotalPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.getAvePriceBasket());
    }
}
