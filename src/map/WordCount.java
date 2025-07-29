package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        String s = "Very beautiful day and bright day";
        String[] words = s.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String w: words){
            wordCount.put(w,wordCount.getOrDefault(w,0)+1);
        }

        wordCount.forEach((k,v)-> System.out.println(k + " = " + v));

        System.out.println("Using Stream------");
        Map<String,Long> wordFreq = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        wordFreq.forEach((k,v)-> System.out.println(k + " = "+ v));
    }
}
