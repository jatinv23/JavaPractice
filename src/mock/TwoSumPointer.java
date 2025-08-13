package mock;

import java.util.Arrays;

public class TwoSumPointer {
    public static void main(String[] args) {

        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] indices = targetSum(input,target);
        System.out.println(indices[0]+ " " + indices[1]);
        //print array as list
        System.out.println(Arrays.toString(indices));

    }

    public  static int[] targetSum(int[] input, int target){

        int left = 0;
        int right = input.length-1;

        while(left<right){
            int sum = input[left]+input[right];
            if (sum==target){
                return new int[]{left+1,right+1};
            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
