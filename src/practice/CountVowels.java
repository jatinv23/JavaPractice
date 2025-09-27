package practice;

public class CountVowels {

    public static void main(String[] args) {
        String s = " Java is a fun language";


        int count = s.length() - s.replaceAll("[aeiouAEIOU]", "").length();

        System.out.println("Number of vowels in the string: " + count);

        //other way to count vowels
        int vowelCount = 0;
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string (using loop): " + vowelCount);

    }
}
