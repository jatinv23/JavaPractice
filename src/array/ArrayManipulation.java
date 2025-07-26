package array;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] number = {55,22,66,7,88,5};
        Arrays.sort(number);
        for(int a:number){
            System.out.println(a);
        }
        //Adding elem to an array
        number = new int[]{44};
        //copy the original array to a new array with one extra element
        int[] newNumber = Arrays.copyOf(number, number.length + 1);
        //add the new element to the end of the new array
        newNumber[newNumber.length - 1] = 99;
        for(int i:newNumber){
            System.out.println(i);
        }

        //Multidimensional Array
        //Declaration
        int[][] matrix;

        // Initialization
        matrix = new int[3][3]; // 3x3 matrix

        // Combined Declaration and Initialization
        int[][] matrixNew = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int firstElement = matrixNew[1][2]; // Accessing the first element
        matrixNew[1][1] = 10; // Changing the center element

        System.out.println("First element of matrix: " + firstElement);

        // Printing the entire matrix
        System.out.println("Matrix:");
        for(int i = 0;i<matrixNew.length;i++){// Loop through rows
            for(int j=0;j<matrixNew[i].length;j++){// Loop through columns
                System.out.println(matrixNew[i][j]);
            }
        }

        
    }

}
