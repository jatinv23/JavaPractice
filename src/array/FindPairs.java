package array;

public class FindPairs {

    public static void main(String[] args) {
        int arr[] = {2,6,3,5,8,11};
        int target = 14;

        findPairs(arr,target);
    }

    private static void findPairs(int[] arr, int target) {
        for(int i=0;i< arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found : " + arr[i] + " " + arr[j]);
                }
            }
        }
        System.out.println("No pair found");
    }
}
