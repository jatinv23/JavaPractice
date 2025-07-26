package array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] number = {1,3,4,5,6};
        int n = 6;
        int findmissingnumber = missingNumber(number,n);
        System.out.println("Missing number is "+ findmissingnumber);
    }

    private static int missingNumber(int[] number, int n) {

        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int s:number){
            actualSum=actualSum+s;
        }
        return expectedSum-actualSum;
    }
}
