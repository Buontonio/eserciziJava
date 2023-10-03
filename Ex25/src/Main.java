//        Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
//        Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[26];
        arrFiller(charArray);
        System.out.println(" ");
        System.out.println(charCounter(charArray));
    }

    public static void arrFiller(char[] x) {
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = (char) (r.nextInt(26) + 97);
            System.out.print(x[i]);

        }
    }

    public static int charCounter(char[] y) {
        int a = 0;
        for (int j = 0; j < y.length; j++) {
            if (y[j] == 'a') {
                a += 1;
            }
        }
        return a;
    }
}