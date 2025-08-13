package list;

import java.util.*;

public class PracticeEx {

    public static void main(String[] args) {

        //Remove duplicates from a List while preserving insertion order
        List<String> str = new ArrayList<>(Arrays.asList("A","B","C","A","B","D"));
        List<String> linkedList = new LinkedList<>(str);
        Set<String> set = new HashSet<>(linkedList);
        System.out.println(set);

        //Merge two Lists into one without duplicates

        List<String> str2 = new ArrayList<>(Arrays.asList("D","A","E","C","F"));
        List<String> linkedList2 = new LinkedList<>(str2);
        set.addAll(linkedList);
        set.addAll(linkedList2);

        System.out.println(set);

        //Count the frequency of characters in a String

        String s1 = "aabccaaaaddd";
        Map<Character,Integer> freq = new HashMap<>();

        for (char s: s1.toCharArray()){
            freq.put(s, freq.getOrDefault(s,0)+1);
        }

        freq.forEach((k,v)-> System.out.println(k +" occured = " + v));

        //Remove duplicate elements using Set

        List<Integer> elem = new ArrayList<>(Arrays.asList(1,2,3,1,2,4,5,6,3));
        Set<Integer> unique = new HashSet<>(elem);
        System.out.println("Unique elems are : "+ unique);

        //Reverse a List
        List<String> str3 = new ArrayList<>(Arrays.asList("This","is","for","test"));
        Collections.reverse(str3);
        System.out.println("Reversed list is : "+ str3 );
    }
}
