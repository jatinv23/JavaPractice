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

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0,j = 0,k = 0;
        while(i < arr1.length && j < arr2.length){
            if (arr1[i]<arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            mergedArray[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }
        return mergedArray;
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
