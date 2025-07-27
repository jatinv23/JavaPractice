package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        //add
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("mango");
        arrayList.add("pear");

        //remove
        arrayList.remove("apple");

        //update
        arrayList.set(0,"cherry");

        arrayList.add("banana");
        arrayList.add("apple");

        //fetch
        System.out.println("Fruit name is " + arrayList.get(0));

        //traversal using for loop
        System.out.println("Fruits are : ");
        for (String s:arrayList){
            System.out.print(" " + s + " ");
        }

        //using Iterator
        Iterator<String> iterator = arrayList.iterator();

        System.out.println("\n Using Iterator : " );
        while(iterator.hasNext()){
            System.out.print("  " + iterator.next() + " ");
        }

        ObjectList c1 = new ObjectList();
        c1.setCar("BMW");
        c1.setPrice(400000);

        ObjectList c2 = new ObjectList();
        c2.setCar("Audi");
        c2.setPrice(350000);

        List<ObjectList> carPrice = new ArrayList<>();

        //print car details
        carPrice.add(c1);
        carPrice.add(c2);
        System.out.println("\nCar details are : ");
        for (ObjectList car : carPrice) {
            System.out.println("Car Name: " + car.getCar() + ", Price: " + car.getPrice());
        }

    }
}
