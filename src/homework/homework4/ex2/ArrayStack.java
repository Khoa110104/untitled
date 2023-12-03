package homework.homework4.ex2;
import train.stackandqueue.s2.MyArrayStack;
import train.stackandqueue.s2.Stack;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {
    private int n;
    private E[] array;

    public ArrayStack() {
         array = (E[]) new Object[100];
    }

    @Override
    public void push(E element) {
        if(n == array.length) {
            array = Arrays.copyOf(array, n * 2);
        }
        array[n++] = element;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            n--;
            E value = array[n];
            array[n] = null;
            return value;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public E top() {
        if (!isEmpty()) {
            return array[n-1];
        }
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayStackIterator();
    }
    public int size() {
        return n;
    }

    class ArrayStackIterator implements Iterator<E> {
        private int current = 0;

        public boolean hasNext() {
            return current < n;
        }

        public E next() {
            return array[current++];
        }
    }
    public void print() {
        System.out.print("Stack: [ ");
        for (int i = 0; i <n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
