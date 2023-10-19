//        Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 char lo stampi
//        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 Character lo stampi
//        Scrivere un un valore primitivo per int, double e char e fare autoboxing
//        Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//        Usare le funzioni scritte con i valori creati
public class Main {
    public static void main(String[] args) {

        int num1 = 1;
        double num2 = 2.0;
        char num3 = '3';

        Integer num4 = num1;
        Double num5 = num2;
        Character num6 = num3;

        Integer num7 = 7;
        Double num8 = 8.0;
        Character num9 = '9';

        int num10 = num7;
        double num11 = num8;
        char num12 = num9;

        System.out.println(sumOf2Int(num1,num4));
        System.out.println(printOf1Char(num3));
        System.out.println(sumOf2Integer(num4, num7));
        System.out.println(printOf1Character(num9));
    }

    public static int sumOf2Int(int x, int y) {
        return x+y;
    }

    public static char printOf1Char (char x) {
        return x;
    }

    public static Integer sumOf2Integer(Integer x, Integer y) {
        return x+y;
    }

    public static Character printOf1Character (Character x) {
        return x;
    }
}