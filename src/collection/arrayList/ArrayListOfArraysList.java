package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOfArraysList {
    public static void main(String[] args) {

        List<List<Integer>> listaGeneral =  new ArrayList<>();

        List<Integer>lista1 = new ArrayList<>(Arrays.asList(41,77,74,22,44));
        List<Integer>lista2 = new ArrayList<>(Arrays.asList(12));
        List<Integer>lista3 = new ArrayList<>(Arrays.asList());
        List<Integer>lista4 = new ArrayList<>(Arrays.asList(20,22,33));
        listaGeneral.add(lista1);
        listaGeneral.add(lista2);
        listaGeneral.add(lista3);
        listaGeneral.add(lista4);

        try {
            System.out.println(listaGeneral.get(0).get(1));

        } catch (RuntimeException e) {
            System.out.println("ERROR!");
        }





    }



}
