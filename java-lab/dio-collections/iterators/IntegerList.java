package diocollection.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class IntegerList implements Iterable<Integer> {
    private Integer[] elements;

    private int currentSize = 0;

    IntegerList(int size) {
        this.elements = new Integer[size];
    }

    void add(int element) {
        this.elements[this.currentSize++] = element;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new IntegerListIterator();
    }

    private class IntegerListIterator implements Iterator<Integer> {
        private int currentIndex = 0;


        @Override
        public boolean hasNext() {
            return this.currentIndex < IntegerList.this.elements.length;
        }

        @Override
        public Integer next() {
            try {
                return IntegerList.this.elements[this.currentIndex++];
            } catch (IndexOutOfBoundsException e) {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super Integer> action) {
            Iterator.super.forEachRemaining(action);
        }
    }
}
