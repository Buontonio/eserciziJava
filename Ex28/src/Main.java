import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
        System.out.println(Arrays.deepToString(arrayFiller(matrix)));
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] arrayFiller(int[][] array) {
        for (int i = 0; i< array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }


    public static int[][] transpose(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                result[j][i] = array[i][j];
            }
        }
        return result;
    }
}