//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();

        names.put("1", "Antonio");
        names.put("2", "Luca");
        names.put("3", "Carlo");
        System.out.println("1st HashMap" + names);

        Map<String, String> names2 = new HashMap<>(Map.of("1", "Antonio", "2", "Luca", "3", "Paride",
                "4", "Gianlu", "5", "Matteo", "6", "Federico", "7", "Sara", "8", "Paola", "9", "Francesco", "10", "Paolo"));
        System.out.println("2nd HashMap" + names2);

        Map<String, String> names3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("1", "Antonio"),
                new AbstractMap.SimpleEntry<>("2", "Marco"),
                new AbstractMap.SimpleEntry<>("3", "Giacomo")));

        System.out.println("3rd HashMap"+names3);
    }
}