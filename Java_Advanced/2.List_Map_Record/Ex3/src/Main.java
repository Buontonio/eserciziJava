import java.util.LinkedList;
import java.util.List;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un LinkedList con elementi e stamparlo in console.
//        Aggiungere un elemento al primo posto della lista e uno all'ultimo
//        Stampare la collezione aggiornata
public class Main {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Mango");
        Fruit fruit2 = new Fruit("Papaya");
        Fruit fruit3 = new Fruit("Ananas");

        List<Fruit> fruits = new LinkedList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        System.out.println(fruits);


        Fruit fruit4 = new Fruit("Banana");
        Fruit fruit5 = new Fruit("Apple");

        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);
        System.out.println(fruits);
    }
}