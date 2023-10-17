//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

public class Main {
    public static void main(String[] args) throws Exception {

        int x = 15;
        rangeChecker(x);

    }

    public static boolean rangeChecker(int x) throws Exception {
        if (x >= 0 && x <= 10) {
            System.out.println("The number is within the range");
        } else throw new Exception("The number is out of range");
        return false;
    }
}