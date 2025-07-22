package string;

public class StringImmutabilityExample {

	public static void main(String[] args) {
		  // Create a String object
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        // Attempt to modify the String
        String modifiedString = originalString.concat(" World");
        System.out.println("Modified String: " + modifiedString);

        // Original string remains unchanged
        System.out.println("Original String after modification attempt: " + originalString);
	}

}
