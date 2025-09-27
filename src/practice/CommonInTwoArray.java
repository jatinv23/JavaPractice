package practice;

import java.util.HashSet;

public class CommonInTwoArray {

    public static void main(String[] args) {

        int a[] = {1,2,4,6,7};
        int b[] = {5,8,9,2,10};

        commonInArray(a,b);
    }

    private static void commonInArray(int[] a, int[] b) {

        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }

        System.out.println("Missing elements from array 1 are: ");
        for (int j=0;j<a.length;j++){
            if(!s.contains(a[j])){
                System.out.print(a[j] + " ");
            }
        }
    }
}
