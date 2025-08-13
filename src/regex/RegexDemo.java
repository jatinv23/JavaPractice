package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        String input = "Java is a fun";
        Pattern pattern = Pattern.compile("java");
        Matcher matcher = pattern.matcher(input);
        /*while (matcher.find()){
            System.out.println("Match Found in input string");
        }*/

        //one line code
       // System.out.println(Pattern.compile("Java").matcher(input).find());

        //using method
        System.out.println(isPresent("Ja54ad ","Ja\\d+\\.*"));


    }

    private static boolean isPresent(String input, String search) {
        return Pattern.compile(search).matcher(input).find();
    }
}
