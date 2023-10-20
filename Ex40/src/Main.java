//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
public class Main {
    public static void main(String[] args) throws Exception {

        char x = 'c';
        try {
            charChecker(x);
        }catch (Exception e){
            System.out.printf(String.valueOf(e));
        }
    }

    public static void charChecker(char x) throws Exception {

        if (Character.isDigit((int) x)) {
            System.out.println("The program works correctly");
        } else throw new Exception("The character is not a number");
    }
}
