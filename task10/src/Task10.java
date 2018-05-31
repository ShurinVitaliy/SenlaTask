import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 01.06.2018.
 */
public class Task10 {
    public static void main(String[] args) {
        int []arr = new int[3];
        for (int i = 0; i< 3; i++)
            arr[i]=0;
        Scanner in = new Scanner(System.in);

        try {
           for (int i = 0; i < 3; i++)
               arr[i]=in.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error: invalid input");
        }
        List<String> answ = new ArrayList<String>();
        for (int i = 0; i < 3;i++){
            for (int j = 1; j < 3; j++){
                if(arr[0]*100+arr[1]*10+arr[2]>99&& !answ.contains(Integer.toString( arr[0] * 100 + arr[1] * 10 + arr[2]))) {
                    answ.add(Integer.toString( arr[0] * 100 + arr[1] * 10 + arr[2]));
                }
                int k = arr[0];
                arr[0] = arr[j];
                arr[j] = k;
            }
        }
        System.err.println(answ);


    }
}
