package prac_9;

import java.util.ArrayList;
import java.util.List;


public class ex_1 {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> uniqueList = new ArrayList<>();
        for (T element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }

    public static <T> int linearSearch(T[] array, T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static class Circle implements Comparable<Circle> {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public int compareTo(Circle other) {
            return Double.compare(this.radius, other.radius);
        }

        @Override
        public String toString() {
            return "Circle(radius=" + radius + ")";
        }
    }

        public static Circle findLargest(Circle[] circles) {
            if (circles == null || circles.length == 0) return null;

            Circle largest = circles[0];
            for (Circle circle : circles) {
                if (circle.compareTo(largest) > 0) {
                    largest = circle;
                }
            }
            return largest;
        }

        public static Circle findLargestIn2DArray(Circle[][] circles) {
            if (circles == null || circles.length == 0 || circles[0].length == 0) return null;

            Circle largest = circles[0][0];
            for (Circle[] row : circles) {
                for (Circle circle : row) {
                    if (circle.compareTo(largest) > 0) {
                        largest = circle;
                    }
                }
            }
            return largest;
        }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        System.out.println("Без дубликатов: " + removeDuplicates(numbers));

        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Позиция элемента 3: " + linearSearch(array, 3));
        System.out.println("Позиция элемента 6: " + linearSearch(array, 6));

        Circle[] circles = { new Circle(1.0), new Circle(2.5), new Circle(1.5) };
        System.out.println("Наибольший круг: " + findLargest(circles));

        Circle[][] circles2D = {
                { new Circle(1.0), new Circle(2.5) },
                { new Circle(3.0), new Circle(0.5) }
        };
        System.out.println("Наибольший круг в 2D массиве: " + findLargestIn2DArray(circles2D));
    }
}
