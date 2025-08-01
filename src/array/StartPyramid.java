package array;

public class StartPyramid {

    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid
        printPyramid(n);
    }

    private static void printPyramid(int n) {

        for(int i=1;i<=n;i++){
            //Print leading spaces
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            //Print stars
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
