public class Display {

    private final int diagonal;
    private final TypeDisplay type;
    private final int weight;

    public Display(int diagonal, TypeDisplay type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public TypeDisplay getType() {
        return type;
    }

    public int getWeightDisplay() {
        return weight;
    }

    public String toString() {
        return "Диагональ = " + diagonal +
                ", Тип матрицы = " + type +
                ", Вес монитора = " + weight;
    }

}
