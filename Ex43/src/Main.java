import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {

        try {
            Double numeratore = 5.0;
            Double denominatore = null;

            System.out.println("Your final result is: ");
            System.out.println(division(numeratore, denominatore));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static Scanner sc = new Scanner(System.in);

    public static double division(Double numeratore, Double denominatore) {

        if ((numeratore == null) || (denominatore == null)) {
            throw new NullPointerException("You can't have a \"null\" inside your function.\nPlease verify your operators");
        }
        if (denominatore == 0) {
            throw new ArithmeticException("The denominator can't be eqaul to 0");
        }
        return numeratore/denominatore;
    }
}