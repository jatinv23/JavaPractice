package mock;

import java.util.Arrays;

public class RemoveDuplicateElem {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,4,4,5,6,7,7};

        int k = removeduplicateElm(a);

        System.out.println("New array without duplicate is : " );
        //new array length is k
        System.out.println("Length of new array is: " + k);
        for(int i =0;i<k;i++){
            System.out.print(a[i]+ " ");
        }
    }

    private static int removeduplicateElm(int[] a) {

        int i = 0;

        for(int j=1;j<a.length;j++) {

            if (a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
}
