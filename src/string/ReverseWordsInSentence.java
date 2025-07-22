package string;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		 String sentence = "This is a test";

		 String[] words = sentence.split(" ");
		 
		 StringBuilder reversedSenence = new StringBuilder();
		 for(String word : words) {
			 String reversedWord = new StringBuilder(word).reverse().toString();
			 reversedSenence.append(reversedWord).append(" ");
		 }
		 
		 System.out.println("Reverse sentence is " + reversedSenence.toString().trim());

	}

}
