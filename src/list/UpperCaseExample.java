package list;

import java.util.Arrays;
import java.util.List;

public class UpperCaseExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "emma", "alex");

        // Convert to uppercase using lambda
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Names in uppercase : " + upperNames);
    }
}
