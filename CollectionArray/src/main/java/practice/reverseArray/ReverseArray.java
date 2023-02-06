package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        String[] strings1 = new String[strings.length];
        int j = strings.length;
        for (int i = 0; i < strings.length; i++) {
            j--;
            strings1[j] = strings[i];
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings1[i];
        }
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        return strings;
    }
}