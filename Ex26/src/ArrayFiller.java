import java.util.Random;

public class ArrayFiller {
    public static void arrRandomCharFiller(char[] x) {
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = (char) (r.nextInt(26) + 97);
            System.out.print(x[i]);

        }
        System.out.println(" ");
    }

    public static void arrRandomIntFiller(int[] x) {
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(100);
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");
    }
}