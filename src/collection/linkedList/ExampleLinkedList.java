package collection.linkedList;

import java.util.LinkedList;

public class ExampleLinkedList {

    public static void main(String[] args) {
        // Un linkedList es mejor para insertar, eliminar y actualizar.
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("One");
        linkedList.addLast("Three");
        linkedList.add("Two");

        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();


        // Queue operations

        /** Cunado esta vacia retorna null
        linkedList.poll(); **/

        /**Lanza NoSuchElementException()  cuando esta vacia
        linkedList.pop();**/

        /**Inserta elementos en la cabeza
        linkedList.push("four");**/

        System.out.println(linkedList);

    }
}
