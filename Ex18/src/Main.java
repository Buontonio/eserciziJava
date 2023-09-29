//Scrivi un programma che contenga un metodo che prende in ingresso un carattere
// e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
public class Main {
    public static void main(String[] args) {

        char x='/';

        if (x != '+' && x != '-' && x != '*' && x != '/') {
            System.out.println("The character type is not accepted");
        } else {
            switch (x) {
                case '+':
                System.out.println("The character type is used for the sum");
                    break;
                case '-':
                    System.out.println("The character type is used for the subtraction");
                    break;
                case '*':
                    System.out.println("The character type is used for the multiplication");
                    break;
                case '/':
                    System.out.println("The character type is used for the division");
                    break;
            }
        }
    }
}