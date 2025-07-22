package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "madam";
		
		if(isPalindrome(s)) {
			System.out.println(s + " is Palindrome");
		}else {
			System.out.println(s + " is not Palindrome");
		}

	}

	public static boolean isPalindrome(String s) {

		if(s== null || s.isEmpty()) {
			return false;
		}
		
		StringBuilder sb = new StringBuilder(s);
		String reverse = sb.reverse().toString();
		return s.equals(reverse);
	}

}
