package prac_9.ex_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

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
