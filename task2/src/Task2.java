import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by User on 31.05.2018.
 */
public class Task2 {
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            a = in.nextInt();
            b = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        System.out.println("GCD - "+gcd(a, b));
        System.out.println("LCM - "+a*b/gcd(a,b));
    }
}
