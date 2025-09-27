package mock;

public class MaxOfSubArrayOfSizeK {

    public static void main(String[] args) {

        int a[] = {2,1,5,1,3,2};
        int k=3;

        findMaxSubArray(a,k);
    }

    private static int findMaxSubArray(int[] a, int k) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right=0;right<k;right++){
            sum+=a[right];
        }
        maxSum=sum;

        for (int i=k;i<a.length;i++){

            sum+=a[i]-a[i-k]; //8+1-2=7 wind = 151 =>
            //maxSum = 8, sum 7
            //7+3-1=9
            //maxSum=9
            //9+2-5=6
            //maxSum = 9
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
