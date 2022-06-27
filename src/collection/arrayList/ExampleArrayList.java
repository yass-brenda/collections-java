package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        // Create a list of implements ArraayList
        List<Integer> numbers = new ArrayList<>();

        // Addd elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Lista: " + numbers);

        // Acces element from the list
        int number = numbers.get(2);
        System.out.println("Access the element: "+ number);

        // Remove element
        int removeNumber = numbers.remove(1);
        System.out.println("Remove element: " + removeNumber);


    }

}
