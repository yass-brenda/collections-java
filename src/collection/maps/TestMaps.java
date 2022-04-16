package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        HashMap<String,Employee> personal = new HashMap<String ,Employee>();
        personal.put("145",new Employee("Ulisses"));
        personal.put("146",new Employee("Diego"));
        personal.put("147",new Employee("Barrios"));
        personal.put("148",new Employee("Becerra"));

        System.out.println(personal);
        personal.remove("148");
        System.out.println(personal);
        personal.put("147",new Employee("BB"));
        System.out.println(personal);

        //System.out.println(personal.entrySet()); // Devuelv una coleccion set y la imprima

        for(Map.Entry<String,Employee> entrada : personal.entrySet()){
            String key = entrada.getKey();
            Employee value =  entrada.getValue();
            System.out.println("Clave = "+ key + ", Valor ="+ value );
        }
    }
}

class Employee {

    private String name;
    private int salary;

    public Employee(String  name){
        this.name = name;
        salary = 2000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}