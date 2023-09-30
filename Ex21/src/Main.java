//Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati che vuoi avere
//        e stampi tutti i numeri naturali in ordine inverso
//        (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).


public class Main {
    public static void main(String[] args) {

        int x=6;
        System.out.println(x);

        for (int i=0; i<2; i++) {
            int y = --x;
            System.out.println(y);
        }
    }
}