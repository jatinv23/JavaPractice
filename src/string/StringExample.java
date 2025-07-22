package string;

public class StringExample {

	public static void main(String[] args) {
		//Using Literal
		String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        // Check if str1 and str2 reference the same object
        System.out.println("Are str1 and str2 the same object? " + (str1 == str2));
        System.out.println("Are str1 and str2 the same content? " + (str1.equals(str2)));
        
        //Using String class constructor
        String str3 = new String("Hello, World!");
        String str4 = new String("Hello, World!");
        System.out.println("str1: " + str3);
        System.out.println("str2: " + str4);
        // Check if str1 and str2 reference the same object
        System.out.println("Are str3 and str4 the same object? " + (str3 == str4));
        
        System.out.println("Are str3 and str4 the same content? " + (str3.equals(str4)));



	}

}
