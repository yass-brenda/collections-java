package collection.book;

public class UseBook {
    public static void main(String[] args) {
        Book book1 = new Book("Book1","Ulisses",0001);
        Book book2 = new Book("Book2","Diego",0001);

        if(book1.equals(book2)){
            System.out.print("Is the same book");
        } else {
            System.out.print("Are differents book");
        }


    }
}
