package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("orange", 3);

        Map<String,Integer> sortedMap = map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue)-> oldValue,
                        LinkedHashMap::new
                ));
        sortedMap.forEach((k,v)-> System.out.println(k + " : " + v));
    }
}
