//        Il costruttore accetterà un Builder in input
//        Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono
//        opzionali) per costruire l'oggetto Person.
//        Creare due oggetti Person e stamparli a video

package org.example;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Antonio", "Buonanno", 26, "Via125", "fluido");

        System.out.println(p1);

        PersonBuilder pb1 = new PersonBuilder();

        pb1.setFirstName("Antonio");
        pb1.setLastName("Troiano");
//        pb1.setAge(30);
//        pb1.setAddress("Via di Napoli");

        pb1.build();

        System.out.println(pb1);

    }

}