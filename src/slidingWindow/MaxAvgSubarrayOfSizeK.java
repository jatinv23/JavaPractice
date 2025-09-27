package slidingWindow;

public class MaxAvgSubarrayOfSizeK {

    public static void main(String[] args) {
        int a[] = {1,12,-5,-6,50,3};
        int k = 4;

        double maxAvg = findMaxAvg(a,k);
        System.out.println("Max average of subarray of size k is : " + maxAvg);
    }

    private static double findMaxAvg(int[] a, int k) {
        double sum=0;
        for (int i=0;i<k;i++){
             sum += a[i];
        }

        double max = sum;

        for (int i=k;i<a.length;i++){
            sum += a[i]-a[i-k];
            max=Math.max(sum,max);
        }
        return max/k; // return average
    }
}
