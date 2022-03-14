package oop.collections.perfomance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestFirstPosition {
    public static void main(String[] args) {
        System.out.println("Starting...");

        long start = System.currentTimeMillis();

        //List<Integer> test = new LinkedList<>();
        List<Integer> test = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            test.add(0, i);
        }

        long end = System.currentTimeMillis();
        double time = (end - start) / 1000.0;
        System.out.println("Time Spent: " + time);
    }
}
