package oop.homework.homework4.ex4;

public class CircularQueue<E> {
    private E[] queue;
    private int n;
    private int top;
    private int count;
    private int default_size = 100;

    public CircularQueue() {
        n = default_size;
        queue = (E[]) new Object[n];
    }

    public CircularQueue(int size) {
        n = size;
        queue = (E[]) new Object[n];
    }

    public void enqueue(E element) {
        if (count < n) {
            queue[(top + count) % n] = element;
            count++;
        } else {
            System.out.println("Queue is full!!!" + "\n->(add: " + element + ", remove: " + queue[top] + ")");
            top = (top + 1) % n;
            queue[(top + count - 1) % n] = element;
        }
    }

    public E dequeue() {
        if (count > 0) {
            E data = queue[top];
            top = (top + 1) % n;
            count--;
            return data;
        } else {
            System.out.println("Queue is empty!!!");
            return null;
        }
    }

    public E peek() {
        if (count > 0) {
            return queue[top];
        } else {
            System.out.println("Queue is empty!!!");
            return null;
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == n;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.print("Queue: [ ");
        int ind = top;
        for (int i = 0; i < count; i++) {
            System.out.print(queue[ind] + " ");
            ind = (ind + 1) % n;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("---------------CircularQueue---------------");
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        System.out.println("Empty: " + queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Enqueue: 1 -> 2 -> 3");
        queue.printQueue();
        System.out.println("Empty: " + queue.isEmpty() );

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.printQueue();
        System.out.println("Enqueue: 4 -> 5 -> 6 -> 7");
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.printQueue();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Enqueue: 8");
        queue.enqueue(8);
        System.out.println("Peek: " + queue.peek());
        queue.printQueue();
        System.out.println("Dequeue: " + queue.dequeue());
    }
}
