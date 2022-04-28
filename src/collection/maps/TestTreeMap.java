package collection.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map;
        map = new TreeMap<>();

        map.put(1,"Uno");
        map.put(2,"Dos");
        map.put(3,"Tres");
        map.put(50,"Cincuenta");

        System.out.println(map);
        System.out.println(map.get(50));
        System.out.println(map.containsValue("Uno"));
    }
}
