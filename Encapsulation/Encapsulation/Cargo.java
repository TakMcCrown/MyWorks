public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final boolean propertyTurnOver;
    private final String regNumber;
    private final boolean fragile;


    public Cargo(Dimensions dimensions, int weight, String address, boolean propertyTurnOver, String regNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.propertyTurnOver = propertyTurnOver;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public double getDimension() {
        return dimensions.getVolume();
    }

    public int getWeight() {
        return weight;
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, address, propertyTurnOver, regNumber, fragile);
    }

    public String getAddress() {
        return address;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, propertyTurnOver, regNumber, fragile);
    }

    public boolean isPropertyTurnOver() {
        return propertyTurnOver;
    }

    public Cargo setPropertyTurnOver(boolean propertyTurnOver) {
        return new Cargo(dimensions, weight, address, propertyTurnOver, regNumber, fragile);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(dimensions, weight, address, propertyTurnOver, regNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, weight, address, propertyTurnOver, regNumber, fragile);
    }

    public String toString() {
        return  "Вес груза: " + getWeight() + "\n" +
                "Адрес доставки: " + getAddress() + "\n" +
                "Переворачивать: " + isPropertyTurnOver() + "\n" +
                "Регистрационный номер: " + getRegNumber() + "\n" +
                "Хрупкое: " + isFragile() + "\n";
    }
}
