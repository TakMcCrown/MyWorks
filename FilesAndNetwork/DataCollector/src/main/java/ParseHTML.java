import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ParseHTML {

    ArrayList<Stations> stations = new ArrayList<>();
    ArrayList<Lines> lines = new ArrayList<>();

    public void parse() {
        try {
            Document doc = Jsoup.connect("https://skillbox-java.github.io").get();
            System.out.println(doc.getAllElements());
        }catch (Exception ex){
        ex.printStackTrace();
        }

    }

    public void parseLine(){
        try {
            Document doc = Jsoup.connect("https://skillbox-java.github.io").get();
            Elements elements = doc.select("span.js-metro-line");
            for (Element e : elements){
                lines.add(new Lines(e.text(), e.attr("data-line")));
            }
            System.out.println(lines);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public void parseStation(){
        try {
            Document doc = Jsoup.connect("https://skillbox-java.github.io").get();
            Elements elements = doc.select("div.js-metro-stations");
            for (Element q : elements){
                for (Element e : q.select("span.name")){
                    stations.add(new Stations(e.text(), q.attr("data-line")));
                }
            }
            System.out.println(stations);}
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
