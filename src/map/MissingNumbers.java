package map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int size = 10;

        Set<Integer> set = new HashSet<>();

        for (int n:arr){
            set.add(n);
        }

        List<Integer> missingNum = new ArrayList<>();

        for(int i =1;i<=size;i++){
            if (!set.contains(i)){
                missingNum.add(i);
            }
        }
        System.out.println("Missing Numbers are : "+ missingNum);
    }
}
