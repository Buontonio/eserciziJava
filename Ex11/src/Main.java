public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 50;

        System.out.println("The first variable is: " +x);
        System.out.println("The second variable is: " +y);
        System.out.println("Are these two variables different? " + comparison(x,y));
    }
    public static boolean comparison(int x, int y) {
        boolean z = x != y;
        return z;
    }
}
