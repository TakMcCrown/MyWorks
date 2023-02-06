package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        int num = 0;
        char[][] twoDimensionalArray = new char[size][size];
        for (int line = twoDimensionalArray.length - 1; line >= 0; line--){
            for (int column = twoDimensionalArray[line].length - 1; column >= 0; column--){
                if (line == column || line + column == twoDimensionalArray.length -1) {
                    twoDimensionalArray[line][column] = SYMBOL;
                } else {
                    twoDimensionalArray[line][column] = ' ';
                }
            }
        }

        return twoDimensionalArray;
    }
}
