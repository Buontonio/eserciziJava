//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
public class Main {
    public static void main(String[] args) {

        Rettangolo rect1 = new Rettangolo();
        System.out.println(rect1.calcoloArea(3,2));

        Triangolo trian1 = new Triangolo();
        System.out.println(trian1.calcoloArea(5,4));

    }
}