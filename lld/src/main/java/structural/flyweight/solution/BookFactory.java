package structural.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        bookTypes.computeIfAbsent(type, t -> new BookType(t, distributor, otherData));
        return bookTypes.get(type);
    }

}
