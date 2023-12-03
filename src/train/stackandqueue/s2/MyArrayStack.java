package train.stackandqueue.s2;


import java.util.Arrays;
import java.util.Iterator;

public class MyArrayStack<T> implements Stack<T> {
    private int n;
    private T[] array;

    public MyArrayStack() {
        array = (T[]) new Object[100];
    }

    @Override
    public void push(T data) {
        if (n == array.length)
            array = Arrays.copyOf(array, n * 2);
        array[n++] = data;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
//            n--;
//            return array[n];
            n--;
            T value = array[n];
            array[n] = null;
            return value;
        }
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return array[n - 1];
        }
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }

    class ArrayStackIterator implements Iterator<T> {
        private int current = 0;

        public boolean hasNext() {
            return current < n;
        }

        public T next() {
            return array[current++];
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new MyArrayStack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        for (int i : stack) {
            System.out.print(i + " ");
        }
    }
}
