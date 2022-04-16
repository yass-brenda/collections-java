package collection.world;

import java.util.Objects;

public class Country implements Comparable<Country>{
    private String name;
    private String continent;
    private  double height;


    public Country(String name,String continent, double height){
        this.name = name;
        this.continent = continent;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public String getContinent(){
        return continent;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public boolean equals(Object obj){
        boolean sameContinent = false;
        if (obj instanceof Country){
            Country newContry =  (Country) obj;
            if(this.name.equals(newContry.name)){
                return true;
            } else {
                return false;
            }
        }

        return sameContinent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int compareTo(Country o){
        return this.name.compareTo(o.name);
    }

    @Override
    public  String toString(){
        return "Country (" + name +", "+ continent +", " + height+")";
    }
}
