package diocollection.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {
        List<String> stringNumbers =
                Arrays.asList("1","0","4", "1", "2", "3", "9", "6", "5");

        System.out.println("Show All elements of the List:");
        stringNumbers.forEach(el -> System.out.print(el));

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Get the 5 first numbers e put them in a Set:");
        Set<String> firstFive = stringNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(firstFive);

        System.out.println();
        System.out.println();

        System.out.println("Change this list of string to a list of numbers:");
        List<Integer> intNumbers = stringNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(intNumbers);

        System.out.println();
        System.out.println();

        System.out.println("Get even numbers > than 2");
        List<Integer> evenNumbers = intNumbers.stream()
                .filter(i -> i% 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println();
        System.out.println();

        /*System.out.println("Show the average of numbers");*/
        /*intNumbers.stream().average()*/

        System.out.println();
        System.out.println();

        System.out.println("Ignore o 3 primeiros elementos da lista e mostre o restante");
        intNumbers.stream().skip(3).forEach(System.out::println);

        long countUniqueNumbers =
                intNumbers.stream().distinct().count();
        System.out.println("Ficam: " + countUniqueNumbers);

        System.out.println();
        System.out.println();
        System.out.println("Show the less value of the list");
        intNumbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("Show the Max value of the list");
        intNumbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("Soma dos números pares");
        int sumEvenNumbers = intNumbers
                .stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumEvenNumbers);

        System.out.println();
        System.out.println();

        System.out.println("Show the list sorted");
        List<Integer> naturalOrderList = intNumbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(naturalOrderList);

        System.out.println();
        System.out.println();
        System.out.println("Group odd numbers multiple of 3 and 5");
        Map<Boolean, List<Integer>> number3And5 = intNumbers.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(number3And5);








    }
}
