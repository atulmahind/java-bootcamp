package in.mahind.bootcamp.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

class Book {
    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        Book book1 = new Book("A Passage to India", 1924);
        Book book2 = new Book("Invisible Man", 1953);

        HashMap<Book, String> hashMap = new HashMap<>();
        hashMap.put(book1, "A great work of fiction");
        hashMap.put(book2, "won the US National Book Award");
        book2.year = 1952;
        //System.out.println("hashMap.containsValue(\"won the US National Book Award\") : " + hashMap.containsValue("won the US National Book Award"));
        System.out.println(hashMap);

        IdentityHashMap<Book, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(book1, "A great work of fiction");
        identityHashMap.put(book2, "won the US National Book Award");
        book2.year = 1952;
        System.out.println("identityHashMap.get(book2) : " + identityHashMap.get(book2));
    }
}
