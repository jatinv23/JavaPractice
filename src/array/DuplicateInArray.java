package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] number = {1,2,2,4,5,6,3,4,5,6,7};

        List<Integer>  duplicates = findDuplicate(number);

        if(duplicates.isEmpty()){
            System.out.println(" No duplicates found  " + duplicates);
        }else {
            System.out.println(" Duplicate values are " + duplicates);
        }
    }

    private static List<Integer> findDuplicate(int[] number) {

        //HashSet is used because it does not allow duplicate elements
        Set<Integer> set = new HashSet<>();
        //List is used because it allows duplicate elements and maintains insertion order.
        List<Integer> duplicates = new ArrayList<>();

        for (int n: number){
            if(set.contains(n)){
                duplicates.add(n);
            }else {
                set.add(n);
            }
        }

        return duplicates;

    }
}
