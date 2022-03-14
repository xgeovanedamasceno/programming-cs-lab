package oop.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestListReverseOrder {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        for (int i = 1000; i > 0; i--) {
            numbers.add(i);
        }

        System.out.println(numbers);

        Collections.reverse((List<?>) numbers);

        System.out.println(numbers);

    }
}
