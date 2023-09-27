public class Main {
    public static void main(String[] args) {
    int x=4;
    int y=10;
    int z=20;

        System.out.println("The bottom value of the range is: "+x);
        System.out.println("The top value of the range is: "+y);
        System.out.println("The chosen value is: "+z);
        System.out.println("Is the chosen value inside the range? "+calc(x,y,z));
    }
    public static boolean calc(int x, int y, int z) {
        boolean a= (x<z) && (y>z);
        return a;
    }
}