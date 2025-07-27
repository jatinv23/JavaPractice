package list;

import java.util.Arrays;
import java.util.List;

public class SecondLargestInList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 20, 15);

        int max = Integer.MIN_VALUE;
        int  secondMax = Integer.MIN_VALUE;

        for (int n : numbers){
            if(n>max){
                secondMax=max;
                max=n;
            } else if (n>secondMax && n !=max) {
                secondMax = n;
            }
        }

        if (secondMax == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest elem found ");
        }else {
            System.out.println("Second largest elem is  " + secondMax);
        }

    }
}
