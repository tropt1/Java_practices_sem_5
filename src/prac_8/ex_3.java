package prac_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        int monthNumber = 0;
        int year = 0;

        try {
            System.out.print("Введите целое число от 1 до 12: ");
            monthNumber = scanner.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Недопустимое число");
            } else {
                System.out.println("Месяц: " + months[monthNumber - 1]);

                if (monthNumber == 2) {
                    System.out.print("Введите год: ");
                    year = scanner.nextInt();
                    if (isLeapYear(year)) {
                        System.out.println("Количество дней: 29");
                    } else {
                        System.out.println("Количество дней: 28");
                    }
                } else {
                    System.out.println("Количество дней: " + dom[monthNumber - 1]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}

