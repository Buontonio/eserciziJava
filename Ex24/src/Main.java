//Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
//        e che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.

public class Main {
    public static void main(String[] args) {

        int array[] = new int[10];

        for (int i=0; i<array.length; i++) {
            array[i] = i+1;
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] +" ");
        }
    }
}