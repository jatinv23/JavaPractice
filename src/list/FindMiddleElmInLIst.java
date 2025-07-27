package list;

import java.util.LinkedList;
import java.util.List;

public class FindMiddleElmInLIst {

    public static void main(String[] args) {
        List<Integer> number = new LinkedList<>();
        number.add(2);
        number.add(4);
        number.add(5);
        number.add(7);
        number.add(8);

        //logic to find middle element in single pass
        Integer middleElement = findMiddleElement(number);
        if (middleElement != null) {
            System.out.println("Middle element is: " + middleElement);
        } else {
            System.out.println("List is empty, no middle element found.");
        }


    }

    private static Integer findMiddleElement(List<Integer> number) {
        if (number == null || number.isEmpty()) {
            return null; // Handle empty list case
        }

        //use node pointers to find middle element
        int slowPointer = 0;
        int fastPointer = 0;
        int size = number.size();
        while (fastPointer < size && fastPointer + 1 < size) {
            slowPointer++;
            fastPointer += 2; // Move fast pointer by 2 steps
        }
        // Return the middle element
        return number.get(slowPointer);
    }
}
