import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 31.05.2018.
 */
public class Task5 {
    public static String blank_line(String primaryString){
        primaryString = primaryString.replace(',',' ');
        primaryString = primaryString.trim();
        primaryString = primaryString.replaceAll("[\\s]{2,}", " ");
        return primaryString;
    }

    public static List<String> get_words(String blankLine){
        List<String> words = new ArrayList<String>();
        boolean flag = true;
        String currentStrin = "";
        for (int i=0; i < blankLine.length(); i++){
            if(!Character.isLetter(blankLine.charAt(i))){
                words.add(currentStrin);
                currentStrin = "";
            }
            else{
                currentStrin = currentStrin + blankLine.charAt(i);
                if(i == blankLine.length()-1)
                    words.add(currentStrin);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String word = in.nextLine();
        word = blank_line(word);
        string = blank_line(string);
        int count = 0;
        List<String> words = get_words(string);
        for (String wordq : words) {
            if (wordq.equals(word)){
                count++;}
        }
        System.out.println(count);

    }
}
