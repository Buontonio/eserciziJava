//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {

        System.out.println("Please insert the Integer value that will be divided for 0");
        zeroDivider(Exception.readInt());

    }

    public static int zeroDivider(int x) {
        try {
            return x/0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide an Integer value for 0");
        }
        return x;
    }
}