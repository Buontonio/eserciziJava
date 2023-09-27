public class Main {
    public static void main(String[] args) {

        int y = 7;
        int x = 5;

//        System.out.println(inc(x));
//        System.out.println(inc(y));
        System.out.println(mult (inc(x),inc(y)));

    }
    public static int inc(int x) {
        return x+=2;
    }
    public static int mult(int x, int y) {
        return x*y;
    }
}