package string;

public class SubstringExample {

	public static void main(String[] args) {
		 String s = "Hello, World!";
	        String sub = "World";
	        System.out.println(isSubstring(s, sub)); // true

	}
	
	 public static boolean isSubstring(String s, String sub) {
	        return s.contains(sub);
	    }

}
