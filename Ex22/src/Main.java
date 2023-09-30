//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
//        la stampa dovrà interrompersi se il valore è uguale a 5.

public class Main {
    public static void main(String[] args) {

        int x=0;

        for (int i=0; i<=10; i++) {
            System.out.println(x);
            x++;

            if(x==5) {
                break;
            }
        }
    }
}