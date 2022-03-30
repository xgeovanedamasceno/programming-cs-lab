package diocollection.iterators;

import java.util.Iterator;

public class IntegerListTest {
    public static void main(String[] args) {
        IntegerList list = new IntegerList(2);

        list.add(123);
        list.add(456);

        Iterator<Integer> iterator = list.iterator();

        iterator.forEachRemaining(number -> System.out.println(number));

        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
