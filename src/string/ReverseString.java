package string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";

		//Using StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
		System.out.println("Reverse string is " + reversed);
		
		//	Using a for Loop
		String rev = "";
		for(int i = str.length()-1; i>=0;i--) {
			rev += str.charAt(i);
		}

		System.out.println("Reverse String is" + rev);
		
		//Using Character Array
		 char[] chars = str.toCharArray();
	        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
	            char temp = chars[i];
	            chars[i] = chars[j];
	            chars[j] = temp;
	        }
	        String reversedStr = new String(chars);
	        System.out.println("Reversed String: " + reversedStr);
	        
	        
	    }
	

}
