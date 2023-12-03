package homework.homework3.ex2;

import java.util.Iterator;
import java.util.Objects;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Objects[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        if (capacity < 0) {
            System.out.println("Capacity must be greater than 0");
        }
        array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T data) {
        if (n >= array.length) {
            enlarge();
        }
        array[n] = data;
        n++;
    }

    @Override
    public T get(int i) {
        if (isEmpty()) {
            return null;
        }
        checkBoundaries(i, n);
        return array[i];
    }

    @Override
    public void set(int i, T data) {
        if (isEmpty()) {
            return;
        }
        checkBoundaries(i, n);
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        if (isEmpty()) {
            System.out.println("NULL");
            return;
        }
        if (!isContain(data)) {
            System.out.println("data does not exist");
            return;
        }
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (Objects.equals(array[i], data)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        n--;
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (Objects.equals(array[i], data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < n;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    return null;
                }
                return array[currentIndex++];
            }
        };
    }

    private static void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void enlarge() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, n);
        array = newArray;
    }

    public String toString(SimpleArrayList arrayList) {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (arrayList.size() > 0) {
            stringBuilder.append(arrayList.get(0));
            for (int i = 1; i < size(); i++) {
                stringBuilder.append(", ").append(arrayList.get(i));
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
