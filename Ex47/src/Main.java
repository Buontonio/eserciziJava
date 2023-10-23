//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Numbers num1 = new Numbers();
        num1.setValue(50);
        System.out.println("These are the values contained in the starting set:");
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(10,30,50,40,55,60));
        System.out.println(numbers);
//        hashSetFiller(numbers);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value == num1.getValue()) {
                iterator.remove();
            }
        }
        System.out.println("These are the remaining values after the removal function:");
        System.out.println(numbers);

        numbers.clear();
        System.out.println("This is the last status of the set:");
        System.out.println(numbers);
    }

//    public static HashSet<Integer> hashSetFiller(Set<Integer> set) {
//        Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//            set.add(r.nextInt(1, 100));
//        }
//        System.out.println(set);
//        return (HashSet<Integer>) set;
//    }
}