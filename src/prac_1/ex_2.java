package prac_1;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args){
        final double RUBLES_PER_YUAN = 11.91;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму в юанях: ");
        int yuan = input.nextInt();

        int digit = yuan % 10;
        String word;

        if (digit == 1 && yuan != 11)
            word = " китайский юань";
        else if (digit >= 2 && digit <= 4 && (yuan < 10 || yuan > 20))
            word = " китайских юаня";
        else
            word = " китайских юаней";

        double rubles = RUBLES_PER_YUAN * yuan;

        System.out.println(yuan + word + " в рублях: " + rubles);
    }
}