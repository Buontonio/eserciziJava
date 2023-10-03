//        Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
//        Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.
public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[26];
        ArrayFiller.arrRandomCharFiller(charArray);
        ArrayCounter.aCharCounter(charArray);
    }


}