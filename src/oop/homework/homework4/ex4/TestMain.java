package oop.homework.homework4.ex4;

import homework.homework4.ex4.ArrayQueue;
import homework.homework4.ex4.CircularQueue;
import homework.homework4.ex4.LinkedListQueue;

public class TestMain {
    public static void main(String[] args) {
        //LinkedListQueue
        System.out.println("----------LinkedListQueue----------");
        LinkedListQueue linkedListQueue = new LinkedListQueue<>();
        System.out.println("Empty: " + linkedListQueue.isEmpty());
        System.out.println("Push: 1");
        linkedListQueue.enqueue(1);
        linkedListQueue.printList();
        System.out.println("Empty: " + linkedListQueue.isEmpty());
        System.out.println("Push: 2,3,4");
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.printList();
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        linkedListQueue.printList();
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("Empty: " + linkedListQueue.isEmpty());

        //ArrayQueue
        System.out.println("----------ArrayQueue----------");
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(3);

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

        //CircularQueue
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
