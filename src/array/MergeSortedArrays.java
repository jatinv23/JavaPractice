package array;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int[] b = {2,4,7,8,9};

        int[] mergedArray = mergeSortedArray(a,b);
                //mergeSortedArrays(a,b);

        System.out.println("Merged array is ");
        for (int m:mergedArray){
            System.out.print(m + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0,j = 0,k = 0;
        while(i < a.length && j < b.length){
            if (a[i]<b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        return c;
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int left = arr1.length-1;
        int right = 0;

        while(left>=0 && right < arr2.length){
            if (arr1[left]>arr2[right]){
                int temp = arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else {
                break;
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);


        }

        // Return the merged array
        int[] mergedArray = new int[arr1.length + arr2.length];
        // Copy elements from both arrays into the merged array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }
}
