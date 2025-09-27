package practice;

public class MaxProductArrayOfposnegInteger {

    public static void main(String[] args) {

        int a[] ={1,5,4,2,7,-5,-9};

        maxProductArrayOfposnegInteger(a);
    }

    private static void maxProductArrayOfposnegInteger(int[] a) {

        int max1= Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;

        for(int num:a){
            if (num>max1){
                max2=max1;
                max1=num;
            }else if (num>max2){
                max2=num;
            }
        }

        for(int num:a){
            if (num<min1){
                min2=min1;
                min1=num;
            }else if (num<min2){
                min2=num;
            }
        }

        // Calculate products
        int product1 = max1 * max2;
        int product2 = min1 * min2;

        if (product1 > product2) {
            System.out.println("Maximum product pair is: (" + max1 + ", " + max2 + ")");
            System.out.println("Product = " + product1);
        } else if (product1==product2) {
            System.out.println("Both Maximum and Mininimum pair having same product");
            System.out.println("Maximum product pair is: (" + max1 + ", " + max2 + ")");
            System.out.println("Maximum product pair is: (" + min1 + ", " + min2 + ")");
            System.out.println("Product = " + product2);

        } else {
            System.out.println("Maximum product pair is: (" + min1 + ", " + min2 + ")");
            System.out.println("Product = " + product2);
        }
    }
}
