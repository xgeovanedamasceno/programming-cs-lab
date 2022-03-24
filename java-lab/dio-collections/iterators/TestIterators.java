package diocollection.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class TestIterators {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        AtomicInteger atomicInteger = new AtomicInteger();

        Iterator<Integer> numbersIterator = numbers.iterator();

        Integer sum = 0;

        //1
        /*numbersInterator.forEachRemaining(number -> sum += number);*/
        numbersIterator.forEachRemaining(number -> atomicInteger.addAndGet(number));
        System.out.println("Atomic Sum: " + atomicInteger.get());

        //2
       /* while (numbersIterator.hasNext()) {
            Integer nextNumber = numbersIterator.next();
            sum += nextNumber;
            System.out.println(sum);
        }

        System.out.println(sum); // output 1

        //3
        System.out.println("Second while");
        while (numbersIterator.hasNext()) {
            Integer nextNumber = numbersIterator.next();
            sum += nextNumber;
            System.out.println(sum);

        }

        System.out.println(sum); // output 2*/


    }
}
