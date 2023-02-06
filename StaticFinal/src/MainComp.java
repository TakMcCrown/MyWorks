public class MainComp {
    public static void main(String[] args) {
        Cpu i3 = new Cpu(3.8, 4, "Интел", 500);
        Ram HyperX = new Ram(TypeRam.DDR4, 8, 200);
        Memory wdBlue = new Memory(TypeMem.HDD, 1000, 200);
        Keyboard Razer = new Keyboard(TypeKeyboard.MECHANICAL, true, 300);
        Display Lg = new Display(27, TypeDisplay.IPS, 500);

        Computer pc1 = new Computer("HP", "I526", i3, HyperX, wdBlue, Lg, Razer);

        System.out.println(pc1);
    }
}
