import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by User on 01.06.2018.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        try {
            n = in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        String answ = "";
        for (int i = 0; i<n; i++){
            if (i<10||i%10==i/10)
                answ = answ + i+" ";
        }
        System.out.println(answ);
    }
}
