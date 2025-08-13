package regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber {

    public static void main(String[] args) {
        String s = "Test123, Regex456";
        //Pattern pattern = Pattern.compile("\\d+");
        //Matcher matcher = pattern.matcher(s);


       /* while (matcher.find()){
            System.out.println("Found number :" + matcher.group());
        }*/

        // One-liner to extract numbers
        System.out.println(Pattern.compile("\\d+").matcher(s).results().map(MatchResult::group).toList());
    }
}
