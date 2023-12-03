package oop.homework.homework4.ex4;

import homework.homework4.ex4.QueueInterface;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int count = 0;
    private int default_size = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        n = default_size;
        queue = (E[]) new Object[default_size];
    }

    @Override
    public void enqueue(E element) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
        } else {
            queue[(top + count) % n] = element;
            count++;
        }
    }
    public boolean isFull() {
        return count == n;
    }
    public int getSize() {
        return count;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return null;
        } else {
            E data = queue[top];
            top = (top + 1) % n;
            count--;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }

    class ArrayQueueIterator implements Iterator<E> {
        private int current = top;
        private int num = 0;

        @Override
        public boolean hasNext() {
            return num < count;
        }

        @Override
        public E next() {
            E data = queue[(current + num) % n];
            num++;
            return data;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: [ ");
            int index = top;
            for (int i = 0; i < count; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % n;
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue<>(3);
        System.out.println("Empty: " + arrayQueue.isEmpty());
        System.out.println("Enqueue: one");
        arrayQueue.enqueue("one");
        arrayQueue.printList();
        System.out.println("Empty: " + arrayQueue.isEmpty());
        System.out.println("Enqueue: two -> three");
        arrayQueue.enqueue("two");
        arrayQueue.enqueue("three");
        arrayQueue.printList();
        System.out.println("Enqueue: four");
        arrayQueue.enqueue("four");
        arrayQueue.printList();
        System.out.println("Dequeue: " + arrayQueue.dequeue());
        arrayQueue.printList();
    }
}

