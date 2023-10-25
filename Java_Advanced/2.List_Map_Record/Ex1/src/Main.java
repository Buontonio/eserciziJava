//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Antonio", 26);
        Student stud2 = new Student("Antonio", 30);
        Student stud3 = new Student("Luca", 30);
        Student stud4 = new Student("Bruno", 24);

        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        System.out.println(students);


        Student stud5 = new Student("Luca", 27);
        Student stud6 = new Student("MariaGrazia", 28);
        Student stud7 = new Student("Fabio", 32);
        Student stud8 = new Student("Riccardo", 28);


        students.add(stud5);
        students.add(stud6);
        students.add(stud7);
        students.add(stud8);

        System.out.println(students);
    }
}