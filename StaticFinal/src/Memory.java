public class Memory {

    public final TypeMem type;
    public final int volumeMem;
    public final int weight;

    public Memory(TypeMem type, int volume, int weight) {
        this.type = type;
        this.volumeMem = volume;
        this.weight = weight;
    }

    public TypeMem getType() {
        return type;
    }

    public int getVolume() {
        return volumeMem;
    }

    public int getWeightMem() {
        return weight;
    }

    public String toString() {
        return "Тип = " + type +
                ", Объем памяти = " + volumeMem +
                ", Вес = " + weight;
    }

}
