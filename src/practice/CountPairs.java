package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPairs {

    public static void main(String[] args) {
        int a[] ={1,2,3,3,4,4,1,2,4,5,6,7,8};

        totalPairs(a);
        totalCountofPairs(a);
    }

    //first approach
    private static void totalPairs(int a[]){
        Arrays.sort(a);

        int totalcount = 0;
        int i=0;

        while(i<a.length-1){
            if (a[i]==a[i+1]){
                totalcount++;
                i+=2;
            }else {
                i++;
            }
        }

        System.out.println("Total pairs are : " + totalcount);
    }

    //second approach

    public static void totalCountofPairs(int a[]){

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num: a){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int totalPairs = 0;
        for(int count : freq.values()){
            totalPairs+=count/2;
        }

        System.out.println("Total number of pairs are: " + totalPairs);

    }
}
