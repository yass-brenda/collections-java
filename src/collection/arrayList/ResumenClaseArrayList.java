package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import java.util.*;

public class ResumenClaseArrayList {
    public static void main(String[] args) {

        // Creando una lista de ArrayList vacia
        List<String> cadenas = new ArrayList<>();


        //Aquí especifica la longitud inicial de una matriz subyacente.
        // Esto puede ayudarlo a evitar cambios de tamaño innecesarios al agregar nuevos elementos.
        List<String> cadenas2 = new ArrayList<>();
        // Añadiendo elementos
        cadenas2.add("G");
        cadenas2.add("l");
        cadenas2.add(1, "l");
        System.out.println(cadenas2);

        // Insertar varios elementos a la vez
        List<Long> list = new ArrayList<>(Arrays.asList(5L, 6L, 7L));
        System.out.println(list);
        // Lisiterator para recorrer elementos
        ListIterator<Long> it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        // bUscar en arraylist
        System.out.println(list.indexOf(5L)); // Devuelve indice donde se encuentra el valor
        System.out.println(list.lastIndexOf(6L)); // Devuelve indice donde se encuentra el valor

        // Con iterador para listas desordenadas
        while (it.hasNext()){
            Long actual = it.next();
            if(list.contains(5L)){
                System.out.println("true");
            }

        }

        //Listas ordenadas con busqueda binaria
        int index  = Collections.binarySearch(list,7L);
        System.out.println(index);

        // Eliminar elementos
        list.remove(0);


        System.out.println(list + "es la lista");

        // ELiminar por medio del iterador
        while (it.hasNext()){
            if(list.contains(7)){
               it.remove();
            }
        }

        System.out.println(list +" segunda lista");

    }
}
