//PREMESSA: Ho svolto l'esercizio in 2 modi:
//1) Strada semplice (che troverai commentata)
//2) Strada più complessa, in cui si utilizza la funzione checkLength() per identificare il numero di caratteri della
// string e la si richiama all'interno della funzione finalRes() per stampare il messaggio a terminale.

//PS: Ho usato la seconda strada per approfondire/acquisire maggior dimestichezza sul concetto di function/global scope.

// 1st way.

//public class Main {
//    public static void main(String[] args) {
// String a = "aaaaaaaaaaa"; //Here there are 9 chars.
//        int x = a.length(); //Variables that checks the number of chars within the String a.
//        finalRes(x); // This functions reports a message based on the number of chars within the string.
//    }
//    //This function reports a message based on the number of characters within a specific string.
//    public static void finalRes(int x) {
//        if (x < 10) {
//            System.out.println("The length of this string is less than 10 chars");
//        } else if (x == 10) {
//            System.out.println("The length of this string is 10 chars");
//        } else {
//            System.out.println("The length of this string is more than 10 chars");
//        }
//    }
//}

// 2nd way.

public class Main {
    public static void main(String[] args) {
        String a = "aaaaaaaaa"; //Here there are 9 chars.
        checkLength(a); //1st function callout
        finalRes(a); //Final function
    }
    // This function checks the number of chars within a specific string.
    public static int checkLength(String x) {
        return x.length();
    }
    //This function reports a message based on the number of characters within a specific string.
    public static void finalRes(String x) {

        if (checkLength(x) < 10) {
            System.out.println("The length of this string is less than 10 chars");
        } else if (checkLength(x) == 10) {
            System.out.println("The length of this string is 10 chars");
        } else {
            System.out.println("The length of this string is more than 10 chars");
        }
    }
}
