package structural.flyweight.problem;

import java.util.List;
import java.util.Random;

public class Main {

    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10_000_000;

    public static void main(String[] args){
        BookStore store = new BookStore();
        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
            store.storeBook(getRandomName(), getRandomPrice(), "Fantasy", "Ingram", "Extra");
        }
   }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble();
    }
}
