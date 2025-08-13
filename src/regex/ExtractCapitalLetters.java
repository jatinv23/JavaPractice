package regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalLetters {
    public static void main(String[] args) {

        //extract all capital letters word from paragraph
        String paragraph = "This is a Sample Paragraph with Some Capital Letters.";

        System.out.println("Capital letter words are : " + Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(paragraph).results().map(MatchResult::group).toList());



    }
}
