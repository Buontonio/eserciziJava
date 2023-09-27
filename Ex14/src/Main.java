public class Main {
    public static void main(String[] args) {
        int x=10;

        System.out.println("The selected number is: "+x);
        System.out.print("Is the number even? "+numCheck(x));
    }
    public static boolean numCheck(int x) {
        boolean y= x % 2 == 0;
        return y;
    }
}