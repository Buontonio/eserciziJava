public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("The selected number is: " + x);
        System.out.println("Is the number even? " + evenCheck(x));
        System.out.print("Is the number odd? " + oddCheck(x));
    }

    public static boolean evenCheck(int x) {
        boolean y = x % 2 == 0;
        return y;
    }

    public static boolean oddCheck(int x) {
        boolean y = x % 2 != 0;
        return y;
    }
}