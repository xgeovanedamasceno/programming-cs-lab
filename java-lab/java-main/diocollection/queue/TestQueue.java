package diocollection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Double> primeQueue = new LinkedList<Double>();
        primeQueue.add(4.5);
        primeQueue.add(10.1);
        primeQueue.add(11.6);
        primeQueue.add(3.8);
        primeQueue.add(7.8);
        primeQueue.add(1.4);


        System.out.println("Prime Queue:");
        System.out.println(primeQueue);

        System.out.println(primeQueue.element());
        System.out.println(primeQueue.remove());

        System.out.println(primeQueue);
    }
}
