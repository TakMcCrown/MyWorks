public class Dimensions {

    private final double length;
    private final double width;
    private final double height;
    private final double volume;

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    public String toString() {
        return "Длина: " + length + "\n" +
                "Ширина: " + width + "\n" +
                "Высота: " + height + "\n" +
                "Объем: " + volume;
    }
}
