public class Cpu {

    private final double frequency;
    private final int cores;
    private final String manufacturer;
    private final int weight;

    public Cpu(double frequency, int cores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Частота = " + frequency +
                ", Кол-во ядер = " + cores +
                ", Производитель = " + manufacturer +
                ", Вес = " + weight;
    }

}
