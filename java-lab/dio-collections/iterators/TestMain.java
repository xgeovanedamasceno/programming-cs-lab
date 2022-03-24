package diocollection.iterators;

import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
        final int x = 10;

        int y = 10;

        int z = 10;

        z = 11;

        Stream.of(1).forEach(n -> System.out.println(n + x + y));
    }
}
