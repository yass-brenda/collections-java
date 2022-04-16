package collection.treeset;

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

        Article firstA = new Article(1,"First article");
        Article secondA = new Article(200,"Second article");
        Article threeA = new Article(3,"Three article");

        TreeSet<Article> orderArticle = new TreeSet<Article>();
        orderArticle.add(firstA);
        orderArticle.add(secondA);
        orderArticle.add(threeA);

        for (Article article:orderArticle){
            System.out.println(article.getDesc());
        }

    }
}


class Article implements Comparable<Article> {

    private int num;
    private String desc;

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
}

