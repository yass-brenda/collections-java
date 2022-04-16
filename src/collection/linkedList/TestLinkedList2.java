package collection.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("España");
        countries.add("Mexico");
        countries.add("España");
        countries.add("Perú");


        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("DF");
        capitales.add("DF");
        capitales.add("Lima");

        System.out.println(countries);
        System.out.println(capitales);

        ListIterator<String> iterCountries = countries.listIterator();
        ListIterator<String> iterCapitales = capitales.listIterator();
        while (iterCapitales.hasNext()){
            if (iterCountries.hasNext()){
                iterCountries.next();
            }
            iterCountries.add(iterCapitales.next());
        }
        System.out.println(countries);
        iterCapitales = capitales.listIterator();
        while(iterCapitales.hasNext()){
            iterCapitales.next();

            if(iterCapitales.hasNext()){
                iterCapitales.next();
                iterCapitales.remove(); // La posicion dos queda eliminada
            }
        }
        System.out.println(capitales);

        countries.removeAll(capitales); // removemos la coleccion de capitales a la lista de paises.

        System.out.println(countries);
    }
}
