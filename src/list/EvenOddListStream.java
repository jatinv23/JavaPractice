package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddListStream {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 8, 11, 13, 14);

        List<Integer> evenNum = num.stream()
                .filter(a -> a % 2 == 0)
                .toList();
        System.out.println("Even Numbers are " + evenNum);

        List<Integer> oddNum = num.stream()
                .filter(o -> o % 2 != 0)
                .toList();

        System.out.println("Odd Numbers are " + oddNum);
    }
}
