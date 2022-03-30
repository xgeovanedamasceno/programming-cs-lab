package diocollection.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("Forward:");

        iterator.forEachRemaining(element -> System.out.println(element));

        System.out.println();
        System.out.println("Backward:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println();
        System.out.println("Forward again");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
