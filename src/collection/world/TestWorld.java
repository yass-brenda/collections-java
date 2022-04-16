package collection.world;

import java.io.FileNotFoundException;

public class TestWorld {
    public static void main(String[] args) {
        try {
            World world = World.createFormFile("src/collection/world/alturas.txt");
            System.out.println(world.toString());
            World.printInConsole(world.numberOfCountriesForCountries());
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
