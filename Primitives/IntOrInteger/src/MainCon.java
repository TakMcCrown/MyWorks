public class MainCon {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (int i = 0; i < 65536; i++) {
            char e = (char) i;
            if (i == 'Ё' | i == 'ё'){
                System.out.println(i + " - " + e);
            }
            for (char alphabet = 'А'; alphabet < 'я'; alphabet++)
            if (i == alphabet) {
                System.out.println(i + " - " + alphabet);
            }
        }
    }
}
