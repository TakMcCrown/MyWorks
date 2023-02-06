import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParseHTML HTML = new ParseHTML();
        ParsePath Path = new ParsePath();
        //HTML.parse();
        //Парсинг всей страницы

        //HTML.parseLine();
        // Парсинг линий

        HTML.parseStation();
        // Парсинг станций

        //Path.ParsePath();
        // Парсинг папки и поиск файлов

        //Path.ParseCsv();
        // Парсинг данных внутри csv
    }
}
