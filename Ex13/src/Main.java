public class Main {
    public static void main(String[] args) {
    int valInf=4;
    int valConf=30;
    int valSup=20;

        System.out.println("The bottom value of the range is: "+valInf);
        System.out.println("The top value of the range is: "+valSup);
        System.out.println("The chosen value is: "+valConf);
        System.out.println("Is the chosen value within the range? "+calc(valInf,valSup,valConf));
    }
    public static boolean calc(int x, int y, int z) {
        boolean a = (x<=z) && (y>=z);
        return a;
    }
}