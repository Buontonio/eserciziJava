public class Main {
    public static void main(String[] args) {

        Auto car1 = new Auto(3.0, "DD483KT", "Audi", "RS6");
        System.out.println(car1);

        car1.plate = "EF566PT";
        car1.capacity = "3.5";
        car1.brand = "Mercedes";
        car1.model = "GLE";
    }
}