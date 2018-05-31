import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 31.05.2018.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String word = in.nextLine();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while(matcher.find())
            count++;
        System.out.println(count);
    }
}
