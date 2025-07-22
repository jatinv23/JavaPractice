package string;

public class StringBufferAndBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		str = str + " World";
		System.out.println("String is " + str);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("String buffer is " + str);

		StringBuilder sbl = new StringBuilder("Hello");
		sbl.append(" World");
		System.out.println("String builder is " + str);

	}

}
