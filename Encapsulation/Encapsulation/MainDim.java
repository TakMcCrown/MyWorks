public class MainDim {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(5.45,6.26,2);
        Cargo table = new Cargo(dimensions, 10,"Санкт-Петерург", false, "42324634734", false);
        Cargo tableTwo = table.setAddress("Москва");
        System.out.println(dimensions);
        System.out.println(table);
        System.out.println(dimensions);
        System.out.println(tableTwo);
    }
}
