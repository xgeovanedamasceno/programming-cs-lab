package diocollection.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterators {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> numbersIterator = numbers.iterator();

        Integer sum = 0;

        //1
        /*numbersInterator.forEachRemaining(number -> sum += number);*/

        //2
        while (numbersIterator.hasNext()) {
            Integer nextNumber = numbersIterator.next();
            sum += nextNumber;
        }

        System.out.println(sum); // output 1

        //3
        while (numbersIterator.hasNext()) {
            Integer nextNumber = numbersIterator.next();
            sum += nextNumber;

        }

        System.out.println(sum); // output 2


    }
}
