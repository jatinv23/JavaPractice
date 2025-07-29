package map;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCounter {

    public static void main(String[] args) {
        String s= "apple";

        Map<Character, Integer> charFreq = new HashMap<>();

        for (char c : s.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
        }
        System.out.println(charFreq);
    }
}
