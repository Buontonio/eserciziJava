
public class ArrayCounter {
    public static void aCharCounter(char[] x) {
        int y = 0;
        for (char z : x) {
            if (z == 'a') {
                y += 1;
            }
        }
        System.out.println(y);
    }
}
