package regex;

public class ValidateEmailAddress {

    public static void main(String[] args) {

        String email = "test@mail.com";
        //^[a-zA-Z0-9._%+-] checks for the start of the string with allowed characters,
        // next part @ checks for the presence of @ symbol, [a-zA-Z0-9.-]+ checks for domain name,
        // \\. checks for dot before TLD, [a-zA-Z]{2,} checks for TLD with at least 2 characters.
        boolean isvalid = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if (isvalid) {
            System.out.println("Valid email address: " + email);
        } else {
            System.out.println("Invalid email address: " + email);
        }
    }
}
