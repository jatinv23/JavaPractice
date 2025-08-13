package regex;

public class StringDigitsRegex {

    public static void main(String[] args) {

        String str = "My contact number us 123-456-7890 and my zip code is 98765.";
        //.* matches any character (except for line terminators) zero or more times,
        // \d+ matches one or more digits.
        boolean hasDigits = str.matches(".*\\d+.*");
        System.out.println("Does the string contain digits? " + hasDigits);
    }
}
