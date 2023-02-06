public class Keyboard {

    private final TypeKeyboard type;
    private final boolean light;
    private final int weight;

    public Keyboard(TypeKeyboard type, boolean light, int weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public TypeKeyboard getType() {
        return type;
    }

    public boolean isLight() {
        return light;
    }

    public int getWeightKeyboard() {
        return weight;
    }

    public String toString() {
        return "Тип клавиатуры = " + type +
                ", Наличие подсветки = " + light +
                ", Вес клавиатуры = " + weight;
    }

}
