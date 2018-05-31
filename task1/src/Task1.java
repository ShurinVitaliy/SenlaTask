import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class Task1 {
    public static void main(String[] args) {
        boolean even_number = false;
        int digit = 0;
        Scanner in = new Scanner(System.in);

        try {
            digit = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        if (digit % 2 == 0)
            even_number = true;

        boolean isPrime = false;
        for (int i = 2; i <= sqrt(digit); i++){
            if (digit % i == 0)
            {
                isPrime = true;
                break;
            }
        }
        System.out.println("even number - "+even_number);
        System.out.println("Prime number - "+ isPrime);
        System.out.println(digit);
    }
}