package collection.book;

import java.util.Objects;

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

    /**
    public boolean equals(Object object){
        if(object instanceof Book){
            Book otherBook  = (Book)object;

            if(this.ISBN == otherBook.ISBN){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } **/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
