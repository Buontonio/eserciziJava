//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//        Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        System.out.println(forma.calcoloArea(4.2,5.3));

        Rettangolo rettangolo = new Rettangolo();
        System.out.println(rettangolo.calcoloArea(12.5,2));
    }
}