package string;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StrQuetns {

    public static void main(String[] args) {

        //How do you reverse a String in Java?
        String s = "This is to test";
        String a1 = "silent";
        String a2 = "listen";
        boolean flag = isAnagram(a1,a2);
        if(flag){
            System.out.println("Given strings are Anagram ");
        }else {
            System.out.println("Given strings are not Anagram ");
        }
        reverseString(s);
        //System.out.println("Reverse String is : " + reverseString(s));
        reverseManually(s);

        containsVowel(s);

        char firstChar = firstNonRepeatedChar(s);
        System.out.println("\nFirst non-repeated character from a String : " + firstChar);

    }

    //First non-repeated character from a String
    private static Character firstNonRepeatedChar(String s) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==1)
                return entry.getKey();
        }
        return null;
    }

    private static boolean isAnagram(String a1, String a2) {
        if(a1.length()!=a2.length()) return false;

        char[] c1 = a1.toCharArray();
        char[] c2 =a2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    //Check if a vowel is present in a string
    private static void containsVowel(String s) {

        String vowels = "aeiouAEIOU";
        System.out.print("Vowel in string: " );
        for(char c:s.toCharArray()){
            if (vowels.indexOf(c)!= - 1){
                System.out.print("  " +c);
            }
        }
    }

    //Reverse string manually using for loop
    private static void reverseManually(String s) {
        char[] c = s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while(left<right){
            char temp = c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse string is : " + new String(c));
    }

    //Reverse string using in built method
    private static void reverseString(String s) {
        System.out.println("Reverse String is : " + new StringBuilder(s).reverse());
    }
}
