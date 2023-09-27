public class Main {
    public static void main(String[] args) {

        char x = 'a';
        char y = 'a';

        System.out.println("The first character is: " +x);
        System.out.println("The second character is: " +y);
        System.out.println("Are these two characters different? " + comparison(x,y));
    }
    public static boolean comparison(char x, char y) {
        boolean z = x != y;
        return z;
    }
}
