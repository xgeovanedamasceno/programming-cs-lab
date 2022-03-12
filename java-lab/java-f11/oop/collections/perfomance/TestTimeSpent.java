package oop.collections.perfomance;

import java.util.*;

public class TestTimeSpent {
    public static void main(String[] args) {
        System.out.println("Starting...");

        List<Integer> test = new LinkedList<>();

        long start = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total; i++) {
            test.add(i);
        }

        long endInsertion = System.currentTimeMillis();
        long timeInsertion = endInsertion - start;
        System.out.println("Time Insertion: " + timeInsertion);

        for (int i = 0; i < total; i++) {
            test.contains(i);
        }

        long endSearching = System.currentTimeMillis();
        long timeSearching =  endSearching - start;
        System.out.println("Time Searching: " + timeSearching);

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time spent: " + time);


    }
}
