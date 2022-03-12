package oop.compairs;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompareBySize {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Peterson");
        names.add("Bethe");
        names.add("Charles");
        names.add("Andy");

        CompareBySize comparator = new CompareBySize();
        Collections.sort(names, comparator);

        System.out.println(names);

        names.add("Ane");
        names.add("Be");
        names.add("K");

        Collections.sort(names, new CompareBySize());
        System.out.println(names);

        names.add("Vladimir");
        names.add("Elizabeth");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println(names);

        names.add("A");
        names.add("B");
        names.add("C");

        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(names);

        names.add("ZZZZZZZZZZZZZZZZZZZZZZZZZZ");

        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(names);


    }
}
