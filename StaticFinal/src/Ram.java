public class Ram {

    private final TypeRam typeRam;
    private final int volumeRam;
    private final int weight;

    public Ram(TypeRam typeRam, int volumeRam, int weight) {
        this.typeRam = typeRam;
        this.volumeRam = volumeRam;
        this.weight = weight;
    }

    public TypeRam getTypeRam() {
        return typeRam;
    }

    public int getVolumeRam() {
        return volumeRam;
    }

    public int getWeightRam() {
        return weight;
    }

    public String toString() {
        return "Тип памяти = " + typeRam +
                ", Обьем памяти = " + volumeRam +
                ", Вес памяти =  " + weight;
    }

}
