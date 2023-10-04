import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(transpose(matrix)));
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