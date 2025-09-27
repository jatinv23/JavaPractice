package practice;

public class ElementStartDecrease {

    public static void main(String[] args) {

        int a[] = {1,1,2,1,1,1};

        elementDecrese(a);

    }

    private static void elementDecrese(int[] a) {

        int countIndex = 0;

        for (int j=0;j<a.length-1;j++){
            if (a[j]>a[j+1]){
                countIndex=j;
                break;
            }
        }
        System.out.println("Decreasing element found at index " + countIndex + " value is " + a[countIndex]);

    }
}
