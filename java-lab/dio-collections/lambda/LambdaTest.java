package diocollection.lambda;

import java.util.HashSet;
import java.util.Set;

public class LambdaTest {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Integer sum = 0;

        sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);


    }
}
