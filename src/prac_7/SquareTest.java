package prac_7;

import prac_7.orig.*;

public class SquareTest {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Circle(5);
        objects[1] = new Rectangle(4, 6);
        objects[2] = new Square(3);
        objects[3] = new Triangle(3, 4, 5);
        objects[4] = new Circle(2);

        for (GeometricObject object : objects) {
            System.out.println("Площадь: " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}
