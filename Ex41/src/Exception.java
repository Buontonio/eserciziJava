import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception {

    public static Scanner scanner = new Scanner(System.in);
//    public static int readInt;

    public static int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The selected value is not an Integer. \nPlease select an Integer value.");
                scanner.next();
            }
        }
    }
}