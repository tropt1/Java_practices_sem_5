package prac_7;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите три стороны треугольника: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.print("Введите цвет треугольника: ");
            String color = input.next();

            System.out.print("Закрашен ли треугольник? (true/false): ");
            boolean filled = input.nextBoolean();

            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle.toString());
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
