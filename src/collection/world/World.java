package collection.world;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class World {
    List<Country> countries;

    private World(List<Country> paises){
        this.countries = paises;
    }

    public static World createFormFile(String file) throws FileNotFoundException {
       // Austria,Europe,1.792
        List<Country> countriesFiles = new LinkedList<Country>();
        Country countriestem;
        String line;
        String [] dataFiles;
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNextLine()){
            line = sc.nextLine();
            try {
                dataFiles = line.split(",");
                countriestem = new Country(dataFiles[0],dataFiles[1], Double.parseDouble(dataFiles[2]));
                countriesFiles.add(countriestem);
            } catch (Exception e){
                System.out.println("Incorrect Line" + line);
            }

        }
      return new World (countriesFiles);
    }

    public static <K,V> void printInConsole(Map<K,V> map){
        Iterator<K> it = map.keySet().iterator();
        K eleme;
        while (it.hasNext()){
            eleme = it.next();
            System.out.println(eleme + "\t" + map.get(eleme));
        }
    }

    public SortedMap<String, Integer>numberOfCountriesForCountries(){
        SortedMap<String,Integer>countiresForContinent = new TreeMap<>();
        Iterator<Country> it = countries.iterator();
        Country country;
        Integer valor;
        while (it.hasNext()){
            country = it.next();
            valor = countiresForContinent.get(country.getContinent());
            if(valor ==null){
                countiresForContinent.put(country.getContinent(), 1);
            } else {
               valor++;
               countiresForContinent.put(country.getContinent(), valor);
            }
        }

        return countiresForContinent;
    }
}
