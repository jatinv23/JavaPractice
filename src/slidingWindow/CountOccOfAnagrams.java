package slidingWindow;

import java.util.HashMap;

public class CountOccOfAnagrams {

    public static void main(String[] args) {

        String s = "aababaacdabaacd";
        String pattern = "aaba";

        findAnagrams(s, pattern);
    }

    private static void findAnagrams(String s, String pattern) {
        //sliding window
        int count = 0;
        int totalAnagrams = 0;
        int k = pattern.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:pattern.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        count=map.size();
        int i=0,j=0;
        while (j<s.length()){
            char endChar = s.charAt(j);
            if (map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if (map.get(endChar)==0){
                    count--;
                }
            }
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                if (count==0) {
                    totalAnagrams++;
                    System.out.println("Found anagrams at index : " + i);
                }
                char startChar = s.charAt(i);
                if (map.containsKey(startChar)){
                    map.put(startChar,map.get(startChar)+1);
                    if (map.get(startChar)==1){
                        count++;
                    }
                }
                i++;
                j++;
            }

        }
        System.out.println("Total anagrams found: " + totalAnagrams);
    }
}
