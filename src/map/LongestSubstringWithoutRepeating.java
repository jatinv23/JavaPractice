package map;

import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String input = "abcabcbb";
        System.out.println("Longest substring: " + longestSubstring(input)+ " Length of substring is : " + longestSubstring(input).length());
    }

    public static String longestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int start = 0, maxLen = 0, maxStart = 0;

        for (int end=0; end<s.length();end++){
            while (set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart,maxStart+maxLen);
    }
}
