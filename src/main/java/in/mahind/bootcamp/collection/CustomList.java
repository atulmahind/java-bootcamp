package in.mahind.bootcamp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList implements Iterable<List<Integer>> {

    private int[] data;
    private int size;

    public CustomList(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size >= data.length) {
            throw new IllegalStateException("List is full");
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<List<Integer>> iterator() {
        //return new CustomIterator();
        return new PairIterator();
    }

    private class CustomIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size && data[currentIndex] != 0;
        }

        @Override
        public Integer next() {
            return data[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    private class PairIterator implements Iterator<List<Integer>> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public List<Integer> next() {
            List<Integer> pair = new ArrayList<>();
            pair.add(data[currentIndex++]);

            if (currentIndex < size) {
                pair.add(data[currentIndex++]);
            }

            return pair;
        }
    }
}
