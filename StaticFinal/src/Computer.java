public class Computer {

    private final String vendor;
    private final String name;
    private Cpu cpu;
    private Ram ram;
    private Memory memory;
    private Display display;
    private Keyboard keyboard;

    public Computer(String vendor, String name){
        this.vendor = vendor;
        this.name = name;
    };

    public Computer(String vendor, String name, Cpu cpu, Ram ram, Memory memory, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.display = display;
        this.keyboard = keyboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int getAllWeight() {
        int allWeight = cpu.getWeight() + ram.getWeightRam() + memory.getWeightMem() + display.getWeightDisplay() + keyboard.getWeightKeyboard();
        return allWeight;
    }

    public String toString() {
        return  "Производитель компьютера: " + vendor + "\n" +
                "Название компьютера: " + name + "\n" +
                "Общий вес копмлектующих компьютера: " + getAllWeight() + "\n" +
                "Процессор:" + '\n' + cpu + "\n" +
                "Оперативная память:" + "\n" + ram + "\n" +
                "Жесткий диск:" + "\n" + memory + "\n" +
                "Экран:" + "\n" + display + "\n" +
                "Клавиатура:" + "\n" + keyboard;
    }

}
