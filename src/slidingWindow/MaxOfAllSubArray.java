package slidingWindow;

import java.util.*;

public class MaxOfAllSubArray {

    public static void main(String[] args) {

        int a[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        maxOfAllSubArray(a,k);
    }
    private static void maxOfAllSubArray(int[] a, int k) {
        //using sliding window approach
        //need to find a max in each window of size k
        //need to return the max of each subarray of size k in array

        if (k<=0 || k>a.length) return;
        int i=0,j=0;
        Deque<Integer> deque =new ArrayDeque<>();

        while (j<a.length){
            //remove all smaller elements from the deque
            while (!deque.isEmpty() && deque.peekLast()<a[j]){//
                deque.removeLast();
            }
            //add current element at the end of the deque
            deque.addLast(a[j]);

            //if we have not hit the window size k yet, keep expanding the window
            if (j-i+1<k){
                j++;
            }
            //when we hit the window size k
            else if (j-i+1==k){
                //the first element in the deque is the largest element of the previous window
                System.out.print(deque.peekFirst() + " ");

                //before sliding the window, remove the element going out of the window
                if (a[i]==deque.peekFirst()){
                    deque.removeFirst();
                }
                //slide the window
                i++;
                j++;
            }
        }
    }

}


