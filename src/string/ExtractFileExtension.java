package string;

public class ExtractFileExtension {

	public static void main(String[] args) {
		// Example
		String filename = "document.pdf";
		System.out.println(getFileExtension(filename)); // "pdf"

	}

	public static  String getFileExtension(String fname) {
		
		int lastDotindex = fname.lastIndexOf(".");
		if(lastDotindex == -1) {
			return "";
		}
		
		return fname.substring(lastDotindex +1);
		
		
	}
	
}
