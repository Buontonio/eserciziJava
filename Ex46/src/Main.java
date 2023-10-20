//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato


import java.io.ObjectInput;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Numeri num1 = new Numeri();
        num1.setValue(50);

        Set<Integer> integers = new HashSet<Integer>();

        System.out.println("Your integer values are: ");
        setIntFiller(integers);
        integers.add(num1.getValue());
        System.out.println("Does the HashSet contains value \""+num1.getValue()+"\"? "+integers.contains(num1.getValue()));
        System.out.println(integers);

    }

    public static Set<Integer> setIntFiller(Set<Integer> set){
        Random r = new Random();
        for(int i=0; i<5; i++){
            set.add(r.nextInt(1,500));
        }
        System.out.println(set);
        return set;
    }
}