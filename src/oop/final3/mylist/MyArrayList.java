package oop.final3.mylist;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    static int INITIAL_SIZE = 10;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }


    @Override
    public void add(Object obj) {
        if (size == elements.length) {
            enlarge();
        }
        elements[size++] = obj;
    }

    @Override
    public void add(Object obj, int index) {
        if (size == elements.length) {
            enlarge();
        }
        if (!checkBoundaries(index, size)) {
            System.out.println("Can't add " + obj + " at index " + index);
            return;
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = obj;
        size++;
    }

    public void enlarge() {
        elements = Arrays.copyOf(elements, size * 2);
    }

    @Override
    public Object get(int index) {
        if (!checkBoundaries(index, size() - 1)) {
            System.out.println("Can't get object at index " + index);
            return null;
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size() - 1)) {
            System.out.println("Can't remove object at index " + index);
            return;
        }
        for (int i = index; i < size() - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
