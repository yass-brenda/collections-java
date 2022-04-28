package collection.set;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(15);
        nums.add(30);


        //System.out.println(nums);

       // Set<String> nums3 = Set.of("Hello", "world","1","2","3");
        Set<Integer> nums3 = new HashSet<>();
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
        nums3.add(15);
        nums3.add(30);
        nums3.remove(1);

        Iterator<Integer>it = nums3.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }

        for (Integer elements:nums3) {
            System.out.println(elements);
        }

        // nums3.clear(); Elimina todos los elementos
        System.out.println(nums3);

        // Juntar dos conjuntos
        nums3.addAll(Set.of(1,2,400));
        System.out.println(nums3);
        System.out.println(nums3.size());
        System.out.println(nums3.isEmpty());
        System.out.println(nums3.contains(1));

        // Convert java set a list,
        List<Integer>list = new ArrayList<>();
        list.addAll(nums3);

        Set<Integer> nums2 = new TreeSet<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(15);
        nums2.add(30);

        //System.out.println(nums2);

        /**
         * SET
         * No repetidos , se almacenan en desorden(se usa la interfaz) y no tienen indice.
         *
         * En objetos debes sobreescribir los métodos has y equals para que funcione lo de
         * no insertar repetidos. Si no como un objeto aunque contenga sus atributos iguales a
         * otro como se evaluan por medio de referencia y al crear un objeto se le añade
         * una referencia distinta siempre dira que son diferentes.
         *
         * HASSET
         * Lista normal donde no se aceptan duplicados.
         * La posicion del número es random
         * No puedes obtener la posición especifica de un dato.
         *
         *
         * TREESET use comparable interfaz
         * **/
    }


}
