package collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(100);
        numbers.add(89);

        System.out.println(numbers);

        /*
        * No repetidos
        * El orden de inserccion se hace de forma random
        * 
        * */
    }
}
