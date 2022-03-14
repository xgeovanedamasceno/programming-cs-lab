package diocollection.lists;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<Double> grades = new ArrayList<Double>(Arrays.<Double>asList(8.0,9.1,10.4,5.1,3.4));

        System.out.println(grades);

        List<Double> gradesArr = Arrays.asList(6.5,5.6,3.9,4.2,1.0,5.0,6.0);

        System.out.println(gradesArr);

        List<Double> gradesL = List.of(4.58,4.5,9.9,8.7);
        System.out.println(gradesL);

        List<Double> primeList = new ArrayList<>();
        primeList.add(4.5);
        primeList.add(5.5);
        primeList.add(6.5);
        primeList.add(7.5);
        primeList.add(8.5);
        primeList.add(9.5);

        System.out.println(primeList);
        primeList.add(3, 3.3);

        System.out.println(primeList);

        primeList.set(0, 7.7);
        System.out.println(primeList);

        primeList.set(primeList.indexOf(8.5), 11.1);
        System.out.println(primeList);

        System.out.println(primeList.contains(5.5));
        System.out.println(primeList.containsAll(primeList));

        System.out.println(primeList.get(5));

        System.out.println(Collections.min(primeList));

        System.out.println(Collections.max(primeList));

        Iterator<Double> iterator = primeList.iterator();

        Double sum = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            System.out.println(next);
            sum += next;
        }

        System.out.println(sum);

        System.out.println(sum / primeList.size());

        primeList.remove(3.3);

        System.out.println(primeList);

        /*primeList.clear();*/

        System.out.println(primeList.isEmpty());

        /*Iterator<Double> newIterator = primeList.iterator();

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }

        primeList.remove(3);


        System.out.println(primeList);

        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }*/


        System.out.println();




    }
}
