package collection.book;

public class Book {

    private String tittle;
    private String author;
    private int ISBN;

    public Book(String tittle, String author, int ISBN) {
        this.tittle = tittle;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getData(){
        return "The tittle is: " + tittle + " . " + "The author is: " + author + " . " + "And the ISBN is: " +ISBN;
    }
}
