package practice;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n = 122;

        isNumPalindrome(n);
    }

    private static void isNumPalindrome(int n) {

        int temp = n;

        int sum=0;

        while(n>0){
            int r = n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if (temp==sum){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is Not palindrome");
        }
    }
}
