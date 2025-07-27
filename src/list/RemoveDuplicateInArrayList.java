package list;

import java.util.*;

public class RemoveDuplicateInArrayList {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,4,3));
        Set<Integer> set = new LinkedHashSet<Integer>(numberList);
        List<Integer> uniquenumberList = new ArrayList<>(set);
        System.out.println("Array list without deplicate numbers are : " + uniquenumberList);

        Collections.reverse(uniquenumberList);
        System.out.println("reverse array list is : " + uniquenumberList);
    }
}
