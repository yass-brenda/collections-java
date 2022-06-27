package collection.listOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertIteratorToList {
    public static void main(String[] args) {

        // Se presentan las diferentes fromas en que podemos iterar una lista
        Iterator<Integer> iterador = Arrays.asList(1,2,3).iterator();

        // Converter iterator to list Java 8
        List<Integer> actualist = new ArrayList<>();
        while (iterador.hasNext()){
            actualist.add(iterador.next());
        }
        System.out.println(actualist);

        // Usando java 8 Iterator forEachRemaninig
        iterador.forEachRemaining(actualist::add);

        // Convirtiendo un iterador en un iterable
        Iterable<Integer> iterable = () -> iterador;


    }
}
