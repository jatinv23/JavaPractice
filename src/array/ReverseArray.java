package array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        reverseArray(number);
    }

    private static void reverseArray(int[] number) {
        int left =0;
        int right = number.length - 1;
        while(left<right){
            int temp = number[left];
            number[left]=number[right];
            number[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse array is : ");
        for(int n:number){
            System.out.print("  " + n + "  ");
        }
    }
}
