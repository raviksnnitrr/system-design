package structural.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        books.add(new Book(name, price, type, distributor, otherData));
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }
}
