import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lines {

    private String name;
    private String line;
    //private List<Stations> stationsList;

    public Lines(String name, String line){
        this.name = name;
        this.line = line;
        //this.stationsList = new ArrayList<>();
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

    /*public List<Stations> getStationsList() {
        return stationsList;
    }

    public void setStationsList(List<Stations> stationsList) {
        this.stationsList = stationsList;
    }

     */

    public String toString() {
        return "Линия{" +
                "Название='" + name + '\'' +
                ", Номер линии='" + line + '\'' +
                '}';
    }

}
