package prac_10;

import java.util.Scanner;

public class MyStackClient {
    public static void main(String[] args) {
        MyStackDeepClone stack = new MyStackDeepClone();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }

        System.out.println("Strings in reverse order: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
