import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParsePath {

    ArrayList<Stations> stations = new ArrayList<>();
    private String dateFormat = "dd.MM.yyyy";
    String ext = ".json";
    String ext1 = ".csv";
    int js = 0;
    int csv = 0;

    public void ParsePath() throws IOException {
        String path = "I:/Учеба/";

        List<Path> result = Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        for (Path file : result){
            if (file.toString().endsWith(ext) == true){
                js++;
                System.out.println(file);
            }
            if (file.toString().endsWith(ext1) == true){
                csv++;
                System.out.println(file);
            }
        }
        System.out.println("Найдено " + js + " json файла");
        System.out.println("Найдено " + csv + " csv файла");



    }

    public void ParseJSON(){

    }

    public void ParseCsv() throws IOException {
        String path = "I:/Учеба/";

        List<Path> result = Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        List<String> station = new ArrayList<>();

        try {
            for (Path file : result){
                if (file.toString().endsWith(ext1) == true){
                    csv++;
                    station = Files.readAllLines(Paths.get(file.toString()));
                }
            }
            for (String stat : station){
                String[] fragments = stat.split(",");
                if(fragments.length != 2) {
                    System.out.println("Неверные данные");
                    continue;
                }
                if(fragments[1].equals("date")){
                    continue;
                }
                stations.add(new Stations(fragments[0], new SimpleDateFormat(dateFormat).parse(fragments[1])));
            }
            System.out.println(stations);
        }
        catch (Exception ex){
            System.out.println("Невозможно прочитать файл");
        }

    }

}
