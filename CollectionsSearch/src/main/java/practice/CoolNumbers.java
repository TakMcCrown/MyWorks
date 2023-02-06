package practice;

import java.util.*;

public class CoolNumbers {

    public static ArrayList<String> coolNumbersList = new ArrayList<>();
    public static ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();

    public static List<String> generateCoolNumbers() {

        String numberplate = "";
        String numberplateWithoutRegion = "";

        char x, z, y; // первая буква

        ArrayList<Character> allowedLetters = new ArrayList<>() {{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};

        for (Character firstLetter : allowedLetters) { x = firstLetter;
            for (int n = 0; n < 10; n++) { for (Character secondLetter : allowedLetters) {
                    z = secondLetter;
                    for (Character thirdLetter : allowedLetters) {
                        y = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 0; j <= 199; j++) {
                if (j < 10) {
                    coolNumbersList.add(numberplate = String.format("%s0%d", numberWithoutRegion, j));
                } else {
                    coolNumbersList.add(numberplate = String.format("%s%d", numberWithoutRegion, j));
                }
            }
        }

        return coolNumbersList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        Collections.sort(list);
        for (String i : list) {
            if (i.equals(number)) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        if (Collections.binarySearch(sortedList, number) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        HashSet<String> hash = hashSet;
        for (String word : hash) {
            if (hash.contains(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        TreeSet<String> tree = treeSet;
        for (String word : tree) {
            if (tree.contains(number)) {
                return true;
            }
        }
        return false;
    }

}
