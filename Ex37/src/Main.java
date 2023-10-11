public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo();
        System.out.println(triangolo.calcoloArea(3, 2, Geometria.Triangolo));

        Rettangolo rect1 = new Rettangolo();
        System.out.println(rect1.calcoloArea(5, 3, Geometria.Rettangolo));

    }
}