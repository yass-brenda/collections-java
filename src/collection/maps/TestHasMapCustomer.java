package collection.maps;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHasMapCustomer {
    public static void main(String[] args) {

        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("123","Ulisses");

        Map<String,Customer> stringCustomer = new HashMap<>();
        stringCustomer.put("1", new Customer("3","Ulisses"));
        stringCustomer.put("2", new Customer("4","Ulisses"));

        Map<String,String> map =  new HashMap();
        map.put("1","Hola");
        map.put("2","A");
        map.put("3","B");
        map.put("4","C");
        map.put("5","D");


        // Recorrido por medio de Iterator
        Iterator<String> keyIteraror = map.keySet().iterator();
        while(keyIteraror.hasNext()){
            String nextKey = keyIteraror.next();
            System.out.println(nextKey); // Obtiene la llave
            System.out.println(map.get(nextKey)); // Obtiene el valor por medio d ela llave

        }

        for(String key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        map.entrySet().stream().forEach((Map.Entry<String,String>entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });


        System.out.println();

    }

}

class Customer {
    private String id;
    private  String name;

    public Customer(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}