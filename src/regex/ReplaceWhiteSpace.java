package regex;

public class ReplaceWhiteSpace {

    public static void main(String[] args) {

        String ws = " This   i s to t e st w hite spa  ce";
        String c = ws.replaceAll("\\s+", " ");
        System.out.println(c);

    }
}
