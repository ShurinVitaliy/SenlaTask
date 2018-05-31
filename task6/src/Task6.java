import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by User on 31.05.2018.
 */
public class Task6 {
    public static void square_triangle(double max_elem, double a, double b)
    {
        if(max_elem == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))
            System.out.println("this is a square triangle");
        else
            System.out.println("this is not a square triangle");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=0,b=0,c=0;
        try {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: invalid input");
        }
        if(a > b)
        {
            if(a > c)
                square_triangle(a, b, c);
            else
                square_triangle(c, a, b);

        }
        else {
            if (b > c)
                square_triangle(b, c, a);
            else
                square_triangle(c, a, b);
        }

    }
}
