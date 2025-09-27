package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInWindow {

    public static void main(String[] args) {

        int a[] = {12,-1,-7,8,-15,30,16,28};

        int k =3;

        firstNegativeInWindow(a,k);

    }

    private static void firstNegativeInWindow(int[] a, int k) {

        //using sliding window approach
       List<Integer> result = new ArrayList<>();
       int left = 0;

       for (int right=0;right<a.length;right++){
           if (right-left+1==k){
               boolean found = false;
               for (int i=left;i<=right;i++){
                   if (a[i]<0){
                       result.add(a[i]);
                       found=true;
                       break;
                   }
               }
               if (!found){
                   result.add(0);
               }
                left++;
           }

       }

        System.out.println("First negative in each window of size 3 is: ");
       for (int num:result){
           System.out.print(num + " ");
       }
    }
}
