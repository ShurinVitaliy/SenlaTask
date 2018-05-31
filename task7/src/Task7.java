import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 01.06.2018.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        try {
            n = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        double []arr = new double[n];
        Random random = new Random();
        for (int i = 0; i< n; i++)
        {
            arr[i] = random.nextDouble()*200 - 100;
            System.out.println(arr[i]);
        }
        double min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);

    }
}
