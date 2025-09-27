package practice;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int a1[] ={1,3,5,7};
        int a2[] = {2,4,6,8,9};

        int mergedArray[] = mergeTwoAortedArray(a1,a2);

        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    private static int[] mergeTwoAortedArray(int[] a1, int[] a2) {

        int n = a1.length;
        int m = a2.length;
        int result[] = new int [n+m];
        int i=0,j=0,k= 0;
        while(i<n && j<m){
            if (a1[i]<=a2[j]){
                result[k++]=a1[i++];
                result[k++]=a2[j++];
            }
        }

        while (i<n){
            result[k++]=a1[i++];
        }

        while (j<m){
            result[k++]=a2[j++];
        }

        return result;
    }
}