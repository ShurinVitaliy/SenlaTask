import java.util.Scanner;

/**
 * Created by User on 31.05.2018.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean isPol = true;
        for (int i = 0; i < str.length() / 2; i++){
            if (!(str.charAt(i) == str.charAt(str.length()-1-i))) {
                isPol = false;
                break;
            }
        }
        System.out.println(isPol);
    }
}
