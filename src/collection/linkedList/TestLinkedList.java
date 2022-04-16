package collection.linkedList;
import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<String>();
        person.add("Ulisses");
        person.add("Barrios");
        person.add("Becerra");
        person.add("Diego");

        System.out.println(person.size());

        ListIterator<String>it = person.listIterator();
        it.next();
        it.add("Ule");





        // The elements are print in orden to add
        for(String names : person){
            System.out.println(names);
        }
    }
}
