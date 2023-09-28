public class Main {
    public static void main(String[] args) {
        int x = 0;
        numCheck(x);
    }

    public static void numCheck(int x) {
        if (x <= 15 && x!=0) {
            if (x % 5 == 0 && x % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(x);
            }
            numCheck(x + 1);
        } else if (x == 0) {
            System.out.println("The starting value must be >=1");
        }
    }
}