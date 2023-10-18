import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Scrivere una funzione che accetti un array in input e
// provi a dividere un numero dell'array per 0 e
// gestista sia l'eccezione della divisione
// che quella di indice non presente nell'array, leggendone il messaggio.
// Eseguire sempre un blocco di codice scrivendo un messaggio in console.

//Il FINALLY si poteva usare meglio... ma sono alla 32esima ora di DEBBUGGING, abbia pietà di me Professò!

public class Main {
    public static void main(String[] args) {

        System.out.println("Please insert the number of values that you want to manage: ");
        int[] array = new int[sc.nextInt()];
        System.out.println("Insert values to be assigned to the array:");
        arrayUserFiller(array);
        System.out.println("This is the final array just filled:");
        System.out.println(Arrays.toString(array));
        System.out.println("Which value would you like to divide for 0? Please select:\n0) - To chose the 1st value\n1) - To chose the 2nd value\n2) - To chose the 3rd value");
        System.out.println("The selected value is:\n" + zeroDivider(arrayValueChooserDivider(array)));
    }

    public static Scanner sc = new Scanner(System.in);


    public static void arrayUserFiller(int[] array) {

        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    array[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please select an integer number");
                    sc.next();
                } finally {
                    System.out.println("Go on");
                }
            }
        }
    }

    public static int arrayValueChooserDivider(int[] array) {
        while (true) {
            int input;
            try {
                int x = sc.nextInt();
                input = array[x];
                return input;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please select a value equal or lower than " + (array.length - 1) + " (including 0)");
            } catch (InputMismatchException e) {
                System.out.println("Please select an integer value");
                sc.next();
            }
        }
    }

    public static int zeroDivider(int x) {
        try {
            return x / 0;
        } catch (ArithmeticException e) {
            System.out.println("The selected number can't be divided for 0");
        }
        return x;
    }
}