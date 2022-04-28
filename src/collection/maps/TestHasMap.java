package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class TestHasMap {
    public static void main(String[] args) {
        Map<Integer,String> map;
        map = new HashMap<>();

        map.put(1,"Uno");
        map.put(2,"Dos");
        map.put(3,"Tres");
        map.put(50,"Cincuenta");

        System.out.println(map);
        System.out.println(map.get(50));
    }

}
