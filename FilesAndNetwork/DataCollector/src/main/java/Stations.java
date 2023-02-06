import java.util.Date;

public class Stations {


    private String name;
    private String line;
    private Date date;
    private int depth;
    private boolean hasConnection = false;

    public Stations(String name){
        this.name = name;
    }

    public Stations(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public Stations(String name, String line){
        this.name = name;
        this.line = line;
    }

    public Stations(String name, String line, boolean hasConnection){
        this.name = name;
        this.line = line;
        this.hasConnection = hasConnection;
    }

    public Stations(String name, String line, Date date, int depth, boolean hasConnection) {
        this.name = name;
        this.line = line;
        this.date = date;
        this.depth = depth;
        this.hasConnection = hasConnection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isHasConnection() {
        return hasConnection;
    }

    public void setHasConnection(boolean hasConnection) {
        this.hasConnection = hasConnection;
    }

    public String toString() {
        return "Станция{" +
                "Название='" + name + '\'' +
                ", Линия='" + line + '\'' +
                ", дата постройки=" + date +
                ", Глубина=" + depth +
                ", Переход=" + hasConnection +
                '}';
    }

}
