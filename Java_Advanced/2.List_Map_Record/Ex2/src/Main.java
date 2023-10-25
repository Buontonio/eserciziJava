//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con 12 elementi e stamparlo in console.
//        mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class Main {

    public static void main(String[] args) {


        Student stud1 = new Student("Antonio", 26);
        Student stud2 = new Student("Antonio", 30);
        Student stud3 = new Student("Luca", 29);
        Student stud4 = new Student("Marco", 20);
        Student stud5 = new Student("Simone", 19);
        Student stud6 = new Student("Giulia", 25);
        Student stud7 = new Student("Filippo", 23);
        Student stud8 = new Student("Giuseppe", 26);
        Student stud9 = new Student("Bruno", 26);
        Student stud10 = new Student("Stefano", 33);
        Student stud11 = new Student("Fabio", 35);
        Student stud12 = new Student("Pietro", 27);

        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        students.add(stud7);
        students.add(stud8);
        students.add(stud9);
        students.add(stud10);
        students.add(stud11);
        students.add(stud12);
        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(students);
    }
}