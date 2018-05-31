import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        boolean even_number = false;
        int n = 0;
        Scanner in = new Scanner(System.in);

        try {
            n = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            if(i%2==0)
                sum = sum + i;
        }
        System.out.println(sum);

    }
}
