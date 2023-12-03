package train.stackandqueue.s2;

import java.util.Iterator;

public class MyArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int queue;
    private int n;

    public MyArrayQueue() {
        array = (T[]) new Object[100];
    }

    @Override
    public void enqueue(T data) {
        if (n < array.length)
            array[(queue + n++) % array.length] = data;
    }

    @Override
    public T dequeue() {
        if (n > 0) {
            T data = array[queue++];
            if (queue == array.length)
                queue = 0;
            n--;
            return data;
        }
        return null;
    }

    @Override
    public T queue() {
        return array[queue];
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
        return new ArrayQueueIterator();
    }

    class ArrayQueueIterator implements Iterator<T> {
        private int count;

        public boolean hasNext() {
            return count < n;
        }

        public T next() {
            return array[(queue + count++) % array.length];
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new MyArrayQueue<>();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.queue());
        for (int i : queue) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println(queue.queue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.queue());
        for (int i : queue) {
            System.out.println(i + " ");
        }
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());
    }
}
