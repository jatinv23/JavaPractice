package regex;

public class ValidatePhoneNumberFormat {

    public static void main(String[] args) {
        String phnNumr = "123-456-7890";
        boolean isValid = phnNumr.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println(isValid);
    }
}
