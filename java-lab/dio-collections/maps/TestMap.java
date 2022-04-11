package diocollection.maps;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("Robert C. Martins", "Clean Code");
        bookMap.put("Joshua Bloch", "Effective Java");

        for (String key: bookMap.keySet()) {
            System.out.println("Key: " + key + " - Value: " + bookMap.get(key));
        }

        for (Map.Entry<String, String> book: bookMap.entrySet()) {
            System.out.println("Key: " + book.getKey() + " - Value: " + book.getValue());

        }

        System.out.println();
        System.out.println("------------------------------");

        Set<Map.Entry<String, String>> bookEntries = bookMap.entrySet();

        for (Map.Entry<String, String> entries : bookEntries) {
            System.out.println(entries.getKey() + " - " + entries.getValue());

        }



    }
}
