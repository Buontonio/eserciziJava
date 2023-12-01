package org.example;

public class ShapeFactory {

    public static Shape getShape(Type type) {

        Shape shape =
                switch (type) {

                    case CIRCLE -> new Circle();
                    case SQUARE -> new Square();
                    case RECTANGLE -> new Rectangle();
                    case TRIANGLE -> new Triangle();
                    default -> null;
                };
        return shape;
    }

}
