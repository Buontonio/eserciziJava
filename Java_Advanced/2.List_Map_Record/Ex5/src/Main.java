import java.util.*;

//import static jdk.internal.icu.lang.UCharacter.getAge;

//import static java.lang.StringUTF16.compareTo;

public class Main {
    public static void main(String[] args) {

        Map<String, Person> names = new HashMap<>();

        Person p1 = new Person("Antonio", "Buonanno", 26);
        Person p2 = new Person("Marco", "Polenta", 30);
        Person p3 = new Person("Barbara", "Bucciarelli", 34);

        names.put("1", p1);
        names.put("2", p2);
        names.put("3", p3);
        System.out.println("Unsorted HashMap" + names);


        List<Map.Entry<String, Person>> sortedNames = new ArrayList<>(names.entrySet());
        sortedNames.sort(new Comparator<Map.Entry<String, Person>>() {
            @Override
            public int compare(Map.Entry<String, Person> o1, Map.Entry<String, Person> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });

        System.out.println("Sorted list"+sortedNames);
    }
}