import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {


//        System.out.println("Insert first double value: ");
        Double numeratore = 7.0;
        Double denominatore = null;
        System.out.println("Your final result is: ");
        System.out.println(division(numeratore,denominatore));
    }

    public static Scanner sc = new Scanner(System.in);

    public static double division(Double numeratore, Double denominatore) {
        while (true) {
            try {
//                Double numeratore = sc.nextDouble();
//                Double denominatore = sc.nextDouble();
                double result = numeratore / denominatore;
                return result;
            } catch (NullPointerException e) {
                System.out.println("You can't have a \"null\" inside your function.\nPlease verify your operators");
                sc.next();
            }catch (InputMismatchException e) {
                System.out.println("Do not enter characters, integer values needed.\nPlease restart: ");
                sc.next();
            }
        }
    }
}