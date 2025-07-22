package string;

public class StringManipulation {

	public static void main(String[] args) {
		// Strings are immutable
				String str3 = "java";
				str3.concat("oops");
				System.out.println(str3); // java
				
				// The result should be assigned to a new reference variable (or same
				// variable) can be reused.

				String concat = str3.concat("value2");
				System.out.println(concat); // javavalue2
				
				// String methods

				String str = "abcdefghijk";

				
		            //charAt(int paramInt)
				System.out.println(str.charAt(2)); // prints a char - c

				// concat(String paramString)
				System.out.println(str.concat("lmn"));// abcdefghijklmn

				System.out.println("ABC".equalsIgnoreCase("abc"));// true
				System.out.println("ABCDEFGH".length());// 8

				// replace(char paramChar1, char paramChar2)
				System.out.println("012301230123".replace('0', '4'));// 412341234123

				// replace(CharSequence paramCharSequence1, CharSequence
				// paramCharSequence2)
				System.out.println("012301230123".replace("01", "45"));// 452345234523

				
				// All characters from index paramInt
				// String substring(int paramInt)
				System.out.println("abcdefghij".substring(3)); // defghij

				// All characters from index 3 to 6
				System.out.println("abcdefghij".substring(3, 7)); // defg
				// 0123456789

				System.out.println("ABCDEFGHIJ".toLowerCase()); // abcdefghij

				System.out.println("abcdefghij".toUpperCase()); // ABCDEFGHIJ

				System.out.println("abcdefghij".toString()); // abcdefghij

				// trim removes leading and trailings spaces
				System.out.println(" abcd  ".trim()); // abcd


	}

}
