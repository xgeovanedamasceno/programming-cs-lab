package diocollection.maps.tuple;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map.Entry<String, Book> tuple;

        tuple = new AbstractMap.SimpleEntry<>("12345", new Book("Book One","Author One"));
        tuple = new AbstractMap.SimpleEntry<>("67891", new Book("Book Two","Author Two"));


        /*System.out.println(tuple.toString());*/

        List<Map.Entry<String, Book>> orderedTuples = new ArrayList<>();

        orderedTuples.add(new AbstractMap.SimpleEntry<>("12345",
                new Book("Java Introduction", "Chris Tompsom")));
        orderedTuples.add(new AbstractMap.SimpleEntry<>("67891", new Book("Data Structure", "Julia All")));

        orderedTuples.add(new AbstractMap.SimpleEntry<>("67891", new Book("Intro Java", "Chris Tompson")));

        for (Map.Entry<String, Book> tupleEntry : orderedTuples) {
            System.out.println("Key: " + tupleEntry.getKey() + " - value: " + tupleEntry.getValue());
        }


    }
}
