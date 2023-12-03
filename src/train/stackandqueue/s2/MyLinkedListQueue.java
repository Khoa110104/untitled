package train.stackandqueue.s2;

import java.util.Iterator;

public class MyLinkedListQueue<T> implements Queue<T> {
    class Node {
        Node next;
        T data;
    }
    private Node queue = null;
    private Node rear = null;
    private int n ;

    @Override
    public void enqueue(T data) {
        Node node = new Node();
        node.data = data;
        if (isEmpty()) {
            queue = node;
        } else  {
            rear.next = node;
        }
        rear = node;
        n++;
    }

    @Override
    public T dequeue() {
        if (!isEmpty()) {
            T data = queue.data;
            queue = queue.next;
            if (queue == null) {
                rear =null;
            }
            n--;
            return data;
        }
        return null;
    }

    @Override
    public T queue() {
        return queue.data;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkListQueueIterator();
    }
    class LinkListQueueIterator implements Iterator<T> {
        private Node current = queue;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new MyLinkedListQueue<>();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.queue());
        for (int i : queue)
            System.out.print(i + " ");
        System.out.println();
        System.out.println(queue.queue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.queue());
        for (int i : queue)
            System.out.print(i + " ");
    }
}
