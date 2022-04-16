package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        /* TreeSet<String> orderPeople =  new TreeSet<String>(); // Se ordena alfabeticamente o por numeros.
        orderPeople.add("Ulisses");
        orderPeople.add("Diego");
        orderPeople.add("Barrios");

        for (String peoples:orderPeople){
            System.out.println(peoples);
        } */

        Article firstA = new Article(1,"A");
        Article secondA = new Article(200,"B");
        Article threeA = new Article(3,"C");

        TreeSet<Article> orderArticle = new TreeSet<Article>();
        orderArticle.add(firstA);
        orderArticle.add(secondA);
        orderArticle.add(threeA);

        for (Article article:orderArticle){
            System.out.println(article.getDesc());
        }

        Article comparatorArticle  = new Article(); // Construction of objects comparator
        TreeSet <Article> ordenString = new TreeSet<Article>(comparatorArticle); // Los objetos se ordenaran almacenados segun lo que marque comparatorArticle
        ordenString.add(firstA);
        ordenString.add(secondA);
        ordenString.add(threeA);


        for (Article art:ordenString){
            System.out.println(art.getDesc());
        }
    }


}


class Article implements Comparable<Article>, Comparator<Article> {

    private int num;
    private String desc;

    public Article(){

    }

    public Article(int num, String desc){
        this.num = num;
        this.desc = desc;
    }

    @Override
    public int compareTo(Article o) {
        return num - o.num;
    }

    public String getDesc(){
        return desc;
    }

    @Override
    public int compare(Article o1, Article o2) {
        String descriptionA = o2.getDesc();
        String descriptionB = o1.getDesc();

        return descriptionB.compareTo(descriptionA); // Devulve negativo positivo o un cero en base a la comparación.
    }
}

