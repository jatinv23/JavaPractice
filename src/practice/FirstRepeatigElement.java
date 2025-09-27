package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatigElement {

    public static void main(String[] args) {
        int a[] ={1,2,2,3,4,5,3};
        int b[] ={1,2,3,4,5,6};

        firstRepeatElem(a);
        firstRepeatElem(b);
    }

    private static void firstRepeatElem(int[] a) {

        Set<Integer> seen = new HashSet<>();

        int min=0;
        for (int i = a.length - 1; i >= 0; i--) { // why we have started from last index is because we want to find the first repeating element from the end of the array, so that we can get the first repeating element in the original order.
            if (seen.contains(a[i])) {
                min=i;
            } else {
                seen.add(a[i]);
            }
        }
        if (min != 0) {
            System.out.println("First repeating element is: " + a[min]);
        }else {
            System.out.println("No repeating element found");
        }
    }
}
