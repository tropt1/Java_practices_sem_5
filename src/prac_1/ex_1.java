package prac_1;
import java.util.Scanner;


public class ex_1 {
    public static void main(String[] args){
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double rubles;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму в юанях: ");
        yuan = input.nextInt();

        rubles = yuan * ROUBLES_PER_YUAN;

        System.out.println("Сумма в рублях: " + rubles);
    }
}
