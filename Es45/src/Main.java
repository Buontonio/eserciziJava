//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> words = new HashSet<String>();

        System.out.println("These are the elements of the HashSet: ");
        hashSetFiller((HashSet<String>) words);
        System.out.println("The dimension of the HashSet called \"words\" is: "+words.size());
    }

    public static String getAlphaNumericStrings(int n) {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i=0; i<n;i++) {
            int index = (int) (alphaNumericString.length()*Math.random());
            sb.append(alphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public static HashSet<String> hashSetFiller(HashSet<String> hashset) {
            for(int i=0; i<5; i++) {
                hashset.add(getAlphaNumericStrings(10));
            }
        System.out.println(hashset);
        return hashset;
    }
}