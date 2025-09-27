package practice;

import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args) {
        String s1 = "title";
        String s2 = "little";

        isAnagram(s1,s2);
        isAnagram("listen", "silent");
        isAnagram("triangle", "integral");
        isAnagram("apple", "pale");
        isAnagram("hello", "world");
    }

    private static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            System.out.println("String "  + s1 + " and " + s2 +" are NOT anagrams");
            return false;
        }

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean result = Arrays.equals(c1,c2);

        if (result){
            System.out.println("String "  + s1 + " and " + s2 +" are anagrams");
            return true;
        }else {
            System.out.println("String "  + s1 + " and " + s2 +" are NOT anagrams");
            return false;
        }


    }
}
