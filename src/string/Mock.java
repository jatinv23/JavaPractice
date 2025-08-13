package string;

import java.util.*;

public class Mock {

    public static void main(String[] args) {
        String str = "Seleniun is a Automation tool";

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6));

        commomnEvenNum(list1,list2);

        Mock mock = new Mock();
        mock.removeVowel(str);

        //John, 85
        //Alice,92
        //Bob,78
        //Daisy,90

        TreeMap<String, Integer> studNum = new TreeMap<>();
        studNum.put("John", 85);
        studNum.put("Alice", 92);
        studNum.put("Bob", 78);
        studNum.put("Daisy", 90);

        for (Map.Entry<String,Integer> entry: studNum.entrySet()){
            System.out.println("Student name is: " + entry.getKey() + "Roll no is : " + entry.getValue());
        }

    }

    private static void commomnEvenNum(List<Integer> list1, List<Integer> list2) {

        List<Integer> evenNum =  new ArrayList<>();
        for(int i:list1){
            if(i%2==0 && list2.contains(i)){
                evenNum.add(i);
            }
        }
        System.out.println("Even numbers are: " + evenNum);

    }

    public String removeVowel(String s){
        String withoutVowel = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String without vowel : "+ withoutVowel);
        return withoutVowel;
    }




}
