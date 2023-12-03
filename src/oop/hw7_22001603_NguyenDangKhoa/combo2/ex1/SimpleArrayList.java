package oop.hw7_22001603_NguyenDangKhoa.combo2.ex1;

import java.util.Iterator;
import java.util.Objects;

public class SimpleArrayList<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        if (capacity < 0) {
            System.out.println("Capacity must be greater than 0");
        }
        array = (T[]) new Object[capacity];
    }


    public void add(T data) {
        if (n >= array.length) {
            enlarge();
        }
        array[n] = data;
        n++;
    }


    public T get(int i) {
        if (isEmpty()) {
            return null;
        }
        checkBoundaries(i, n);
        return array[i];
    }


    public void set(int i, T data) {
        if (isEmpty()) {
            return;
        }
        checkBoundaries(i, n);
        array[i] = data;
    }


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


    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (Objects.equals(array[i], data)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return n;
    }

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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (size() > 0) {
            stringBuilder.append(get(0));
            for (int i = 1; i < size(); i++) {
                stringBuilder.append(", ").append(get(i));
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
