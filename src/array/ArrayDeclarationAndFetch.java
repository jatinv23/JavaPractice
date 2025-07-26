package array;

public class ArrayDeclarationAndFetch {

    public static void main (String[] args){
        //Declaration of an integer array
        int[] intArray = {1, 2, 5, 7, 9};

        String[] strArray = {"abc", "def", "hij", "klm"};

        double[] doubleArray = {2.55,3.14,6.66};

        System.out.println("Array length of integer array is  "+ intArray.length);
        System.out.println("Array length of String array is  "+ strArray.length);
        System.out.println("Array length of double array is  "+ doubleArray.length);

        //fetch using for loop
        System.out.println("Integer Array data is: ");
        for (int i = 0;i<intArray.length;i++){
            System.out.print(" " + intArray[i] + " ");
        }

        //fetch using for loop
        System.out.println("\n String Array data is:  ");
        for (int i = 0;i<strArray.length;i++){
            System.out.print(" " + strArray[i] + " ");
        }

        //fetch using for loop
        System.out.println("\n Double Array data is:  ");
        for (int i = 0;i<doubleArray.length;i++){
            System.out.print(" " + doubleArray[i] + " ");
        }

        //fetch using enhanced for loop
        System.out.println("\nFetched Integer Array data using enhanced for loop: ");
        for (int p:intArray){
            System.out.print(p);
        }

        //fetch using enhanced for loop
        System.out.println("\nFetched String Array data using enhanced for loop: ");
        for (String s:strArray){
            System.out.print(s);
        }

        //fetch using enhanced for loop
        System.out.println("\nFetched Double Array data using enhanced for loop: ");
        for (double d:doubleArray){
            System.out.print(d);
        }
    }



}
