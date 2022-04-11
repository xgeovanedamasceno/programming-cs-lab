package diocollection.maps.order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random Order");
        System.out.println("HashMap");
        Map<String, Book> myBooks = new HashMap<>();

        myBooks.put("Chatein", new Book("Cortina azul", 144));
        myBooks.put("Beirhs", new Book("O caminho do começo", 144));
        myBooks.put("Amroin", new Book("Morena Simpatica", 144));
        myBooks.put("Birhs", new Book("Zoroalto", 144));


        for (Map.Entry<String, Book> book : myBooks.entrySet()) {
            System.out.println("Code: " + book.getKey() + " Title: " + book.getValue());
        }

        System.out.println();
        System.out.println("Inserction Order");
        System.out.println("LinkedHashMap");
        Map<String, Book> linkedBooks = new LinkedHashMap<>();
        linkedBooks.put("Chatein", new Book("Cortina azul", 639));
        linkedBooks.put("Amroin", new Book("O beijo doce sal", 144));
        linkedBooks.put("Birhs", new Book("O caminho do começo", 255));


        for (Map.Entry<String, Book> book : linkedBooks.entrySet()) {
            System.out.println(book.getKey() + " - : " + book.getValue());
        }

        System.out.println();
        System.out.println("Tree Map");
        System.out.println("Key Order");

        Map<String, Book> treeBooks = new TreeMap<>(myBooks);

        for (Map.Entry<String, Book> treeB : treeBooks.entrySet()) {
            System.out.println(treeB.getKey() + " - " + treeB.getValue());
        }

        System.out.println();
        System.out.println("TreeSet");
        System.out.println("Title Order");
        Set<Map.Entry<String, Book>> mySetBooks = new TreeSet<>(new ComparatorTitle());
        mySetBooks.addAll(myBooks.entrySet());

        for (Map.Entry<String, Book> book : mySetBooks) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }

        System.out.println();
        System.out.println("Order by number of pages");

        Set<Map.Entry<String, Book>> pagesBook = new TreeSet<>(new ComparatorPages());
        pagesBook.addAll(myBooks.entrySet());

        System.out.println(pagesBook);

        /*for (Map.Entry<String, Book> bz: pagesBook) {
            System.out.println(bz.getKey() + " -> " + bz.getValue());
        }*/









    }
}
