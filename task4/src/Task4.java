import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 01.06.2018.
 */
public class Task4 {
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
        if(blankLine.charAt(i)==' '){
            words.add(currentStrin);
            currentStrin = "";
        }
        else{
         currentStrin = currentStrin + blankLine.charAt(i);
            if(i == blankLine.length()-1)
            words.add(currentStrin);
        }
    }
    words.sort(String::compareTo);
    return words;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        List<String> sortedWords = get_words(blank_line(string));
        System.err.println(sortedWords);
        System.out.println(sortedWords.size());

    }
}
