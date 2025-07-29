package map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("------HashMap-----------");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 55);
        hashMap.put("Grapes", 12);
        printMap(hashMap);

        System.out.println("------LinkedHashMap-----------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Apple", 55);
        linkedHashMap.put("Grapes", 12);
        printMap(linkedHashMap);

        System.out.println("------TreeMap-----------");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 55);
        treeMap.put("Grapes", 12);
        printMap(treeMap);

        System.out.println("Get value using key : "+ hashMap.get("Banana"));
        hashMap.remove("Banana");
        printMap(hashMap);
        hashMap.put("Mango", 22);

        System.out.println("Is Key present in map? " + hashMap.containsKey("Mango"));

        System.out.println("Is Value present in map? " + hashMap.containsValue(55));

        System.out.println("Size of the map is " + hashMap.size());

        //Fetch keys
        for(String s: hashMap.keySet()){
            System.out.println("Key : " + s);
        }

        //Fetch values
        for(int i: hashMap.values()){
            System.out.println("Value : " + i);
        }

        System.out.println("Using lambda expression to iterate through the map:");
        hashMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        //Using Iteratot
        Iterator<Map.Entry<String,Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key : "+ entry.getKey() + "Value " + entry.getValue());
        }
    }

    private static void printMap(Map<String, Integer> hashMap) {

        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
