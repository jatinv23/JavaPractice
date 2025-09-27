package practice;

import java.util.regex.Pattern;

public class FirststrSubsequenceOfsecond {

    public static void main(String[] args) {
        String s1 = "is a fun";
        String s2 = "Java is a fun language";

        isFirststrSubsequenceOfsecond(s1,s2);
    }

    private static void isFirststrSubsequenceOfsecond(String s1, String s2) {
        int i=0;
        int j=0;

        while (i<s1.length() && j<s2.length()){

            if (s1.charAt(i)== s2.charAt(j)){
                i++;
            }
          j++;
        }
        if (i==s1.length()){
            System.out.println("First string is substring of second");
        }else {
            System.out.println("First string is NOT substring of second");
        }
    }
}
