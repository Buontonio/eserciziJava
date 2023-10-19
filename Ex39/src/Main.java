//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

public class Main {
    public static void main(String[] args) throws Exception {

        int bottomValue = 5;
        int topValue = 25;
        int value = 4;
        rangeChecker(bottomValue, topValue, value);

    }

    public static boolean rangeChecker(int bottomValue, int topValue, int value) throws Exception {
        if (bottomValue <= value && value <= topValue) {
            System.out.println("The number is within the range");
        } else throw new Exception("The number is out of range");
        return false;
    }
}