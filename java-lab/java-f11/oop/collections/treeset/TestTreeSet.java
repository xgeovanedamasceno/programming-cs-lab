package oop.collections.treeset;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        System.out.println("Original order");
        System.out.println(numbers);


        System.out.println();
        System.out.println("Descending");
        System.out.println(numbers.descendingSet());

    }
}
