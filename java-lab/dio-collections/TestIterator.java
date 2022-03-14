package diocollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Double> primeList = new ArrayList<>();
        primeList.add(4.5);
        primeList.add(5.5);
        primeList.add(6.5);
        primeList.add(7.5);
        primeList.add(8.5);
        primeList.add(9.5);

        Iterator<Double> newIterator = primeList.iterator();

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }

        primeList.remove(3);


        System.out.println(primeList);

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }
    }
}
