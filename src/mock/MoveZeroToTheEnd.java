package mock;

import java.util.Arrays;

public class MoveZeroToTheEnd {
    public static void main(String[] args) {

        int a[] = {0, 1, 0, 3, 12};
       // moveZeroes(a);
        moveZeroesLast(a);
        // Print the modified array
        System.out.println("Array after moving zeroes to the end:");
        System.out.println(Arrays.toString(a));


    }

    private static void moveZeroesLast(int a[]){
        int nonzeroIndex = -1;
        int arraylegth = a.length;

        for (int currentindex = 0; currentindex <arraylegth; currentindex++){
            if(a[currentindex]!=0){
                nonzeroIndex++;

                int temp = a[nonzeroIndex];
                a[nonzeroIndex]=a[currentindex];
                a[currentindex]=temp;
            }
        }
    }

    private static void moveZeroes(int[] a) {
        //using two pointers

        int left=0;
        int right=a.length-1;

        while (left<right){
            if (a[left]==0 && a[right]!=0){
                //swap
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (a[left]!=0) {
                left++;
            } else {
                right--;
            }
        }

    }
}
