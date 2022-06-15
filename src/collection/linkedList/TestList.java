package collection.linkedList;

import java.util.*;

public class TestList {
    public static void main(String[] args) {

        List<Integer> numbers;
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers);



        /* ARRAYLIST VENTAJAS
        * Acepta repetidos
        * Se colocan conforme  se asignan
        * faster accesing datas
        * Arreglo dinamico
        * No adecuado para eliminar ni agregar,
        * Si eliminas un elemento de enmedio del array list pues solo disminuye el contador de
        * elementos pues solo diminuye el contador de elementos.
        *
        * https://www.baeldung.com/java-collections
        * */


        List<Integer> numbers2;
        numbers2 =  new LinkedList<>();
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println(numbers2);

        /* LINKEDLIST VENTAJAS
         * Acepta repetidos
         * Ideales para insertar y eliminar porque solo se actualizan los enlaces.
         * Dinamico
         * No acceso tan rapido
         *
         * SI la posicion es  5 hace 5 pasos
         * Pero si se hace una operación detras de la otra  si es 5 primro y luego 50
         * El promedio es (50+2)/2 0 27.5 promedio que te vas a tardar
         * Si es la primera solo un paso.
         *
         *
         *  LinkedList en java es doblemente ligada significa que puedes ir
         * del primero al ultimo y del ultimo al primero.
         * Permite cualquier elemento incluyendo null.
         * Todas las operaciones se realizan como si fuera doblemente ligada, del 1 al ultimo y viceversa  comienza desde donde sea más cerca el elemento
         *
         *
         *
         * https://www.youtube.com/watch?v=pDTNUS8mgc0
         * https://docs.oracle.com/javase/8/docs/api/
         * https://www.youtube.com/watch?v=oMVRE-U6TTc&list=PLL8woMHwr36HmQfxqqqxns5GexTNmxFqK
         * https://www.baeldung.com/
         * */



    }
}
