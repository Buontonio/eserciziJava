//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
//L'array ottenuto dovrà essere stampato a video.
//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
// L'array ottenuto dovrà essere stampato a video.

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] startingArr = {5, 7, 7, 8, 5, 6, 6};
        System.out.println(Arrays.toString(startingArr));
        // ArrayFiller.arrRandomIntFiller(startingArr);
        arrComparator(startingArr);
    }

    public static void arrComparator(int[] x) {
        for (int j = 0; j < x.length - 1; j++) {
            if (x[j] != x[j + 1]) {
                System.out.print(x[j] + " ");
            }
        }
        if (x[x.length - 1] == x[x.length - 2]) {
            System.out.print(x[x.length - 1]);
        }
    }
}

