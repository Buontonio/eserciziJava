//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome
// del giorno della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
public class Main {
    public static void main(String[] args) {

        int x=8;

        if (x<1 || x>7) {
            System.out.println("Error: The number must be within the range 1 - 7");
        } else {
            switch (x) {
                case 1:
                    System.out.println("The equivalent day is Monday");
                    break;
                case 2:
                    System.out.println("The equivalent day is Tuesday");
                    break;
                case 3:
                    System.out.println("The equivalent day is Wednesday");
                    break;
                case 4:
                    System.out.println("The equivalent day is Thursday");
                    break;
                case 5:
                    System.out.println("The equivalent day is Friday");
                    break;
                case 6:
                    System.out.println("The equivalent day is Saturday");
                    break;
                case 7:
                    System.out.println("The equivalent day is Sunday");
                    break;
            }
        }
    }
}