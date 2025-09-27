package practice;

public class FirstandLastOccurance {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,1,2,2,2,1};

        findFirstAndLAstOccurance(a,1);
    }

    private static void findFirstAndLAstOccurance(int[] a, int num) {

        int firstOcc = -1;
        int lastocc = -1;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==num) {
                if(firstOcc == -1) firstOcc=i;
                lastocc=i;
            }
        }
        System.out.println("First occ is : " + firstOcc + " and last is " + lastocc);

    }
}
