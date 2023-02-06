public class Elevator {

    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor - 1;
    }

    public void moveUp(){
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (currentFloor == floor){
            System.out.println("Вы находитесь на данном этаже");
        } else if (minFloor <= floor && floor <= maxFloor) {
            for (int i = currentFloor; i < floor; i++) {
                moveUp();
                System.out.println("Текущий этаж: " + getCurrentFloor());
            }
            for (int i = currentFloor; i > floor; i--) {
                moveDown();
                System.out.println("Текущий этаж: " + getCurrentFloor());
            }
            System.out.println("Вы приехали на " + getCurrentFloor() + " этаж");
        } else {
            System.out.println("Такого этажа не существует");
        }
    }
}
