package oop.lab.lab9.mylist;


public class MyArrayList extends MyAbstractList {
    private int size;
    private static final int DEFAULT_CAPACITY = 32;
    private Object[] elements;

    public MyArrayList() {
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private void enlarge() {
        Object[] newData = new Object[this.size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = elements[i];
        }
        this.elements = newData;
    }

    @Override
    public void add(Object obj, int index) {
        checkBoundaries(index, size + 1);
        if (size == elements.length) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = obj;
        size++;
    }

    @Override
    public void add(Object obj) {
        if (size == elements.length) {
            enlarge();
        }
        this.elements[size] = obj;
        size++;
    }

    @Override
    public void remove(int index) {
        this.checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        this.checkBoundaries(index, size);
        return this.elements[index];
    }
}

