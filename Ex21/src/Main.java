//Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere
//        e stampi tutti i numeri naturali in ordine inverso
//        (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).


public class Main {
    public static void main(String[] args) {

        int startingValue = 6;
        int numberOfValues = 3;
      cicla(startingValue,numberOfValues);

    }

    public static void cicla(int x, int y) {
        System.out.println(x);
        for (int i = 1; i < y; i++) {
            System.out.println(--x);
        }
    }

}