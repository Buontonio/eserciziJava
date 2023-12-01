//Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
//        Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
//        Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
//        Stampa a video il risultato della funzione draw di ogni shape creata
package org.example;

public class Main {
    public static void main(String[] args) {

        Shape r1 = ShapeFactory.getShape(Type.RECTANGLE);
        Shape q1 = ShapeFactory.getShape(Type.SQUARE);
        Shape t1 = ShapeFactory.getShape(Type.TRIANGLE);
        Shape c1 = ShapeFactory.getShape(Type.CIRCLE);

        System.out.println(r1.draw());
        System.out.println(q1.draw());
        System.out.println(t1.draw());
        System.out.println(c1.draw());
    }
}