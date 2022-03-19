package diocollection.sets;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(14);
        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);

        System.out.println(numbers);

        System.out.println(numbers.contains(5));
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));

        Iterator<Integer> iterator = numbers.iterator();

        Integer sum = 0;

        while(iterator.hasNext()) {
            Integer next = iterator.next();
            sum += next;
        }

        System.out.println(sum);

        System.out.println(sum/numbers.size());

        numbers.remove(5);

        System.out.println(numbers);

        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);

        Iterator<Integer> nIterator = numbers.iterator();

        Integer seven = 7;

        while(nIterator.hasNext()) {
            Integer nextI = nIterator.next();
            if (nextI > seven) System.out.println(nextI);
        }

        numbers.clear();
        System.out.println(numbers.isEmpty());




    }
}
