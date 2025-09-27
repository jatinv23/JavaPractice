package slidingWindow;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {

        int a[] = {1,5,7,-12,-7};
        int k = 3;

        int max = maxSumSubarrayOfSizeK(a,k);
        int max2 = maxSumSubarrayOfSizeK2(a,k);

        System.out.println("Maximum sum " + max);
        System.out.println("Maximum sum " + max2);
    }

    private static int maxSumSubarrayOfSizeK(int[] a, int k) {

        if (k<0 || k>a.length) return -1;

        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int right=0;right<a.length;right++){
            sum+=a[right]; // add the next element to the window
            if (right-left+1==k){// when we hit the window size k
                max=Math.max(max,sum);
                sum-=a[left];// remove the element going out of the window
                left++;
            }
        }
        return max;
    }

    //Sliding window approach
    private static int maxSumSubarrayOfSizeK2(int[] a, int k) {

        if (k<0 || k>a.length) return -1;

        int sum = 0;
        //find sum of first k elements
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int max = sum;

        //slide the window from start to end
        for(int i=k;i<a.length;i++){
            sum+=a[i]-a[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
}
