package diocollection.maps.order;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Book {
    private String title;
    private Integer pages;

    public Book(String title, Integer pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return title + " - pages: " + pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(pages, book.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }
}

class ComparatorTitle implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
        return book1.getValue().getTitle().compareToIgnoreCase(book2.getValue().getTitle());
    }
}

class ComparatorPages implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        if (b1.getValue().getPages() < b2.getValue().getPages()) {
            return -1;
        }
        if (b1.getValue().getPages() > b2.getValue().getPages()) {
            return 1;
        }
        return 0;
    }
}
