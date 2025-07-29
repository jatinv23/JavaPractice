package map;

import java.util.HashMap;
import java.util.Map;

public class ElementOccurrences {

    public static void main(String[] args) {

        int[] n ={1,2,3,2,2,5,3,1,4,4};

        Map<Integer,Integer> occ= new HashMap<>();

        for (int num: n){
                occ.put(num,occ.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: occ.entrySet()){
            System.out.println("element :" + entry.getKey() + " Occurances : "+ entry.getValue());
        }

    }
}
