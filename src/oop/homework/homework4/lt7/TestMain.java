package oop.homework.homework4.lt7;

import homework.homework4.lt7.QueueByStack;

public class TestMain {
    public static void main(String[] args) {
        QueueByStack queueByStack = new QueueByStack();
        System.out.println("Enqueue: 1 -> 2 -> 3 -> 4");
        queueByStack.enqueue(1);
        queueByStack.enqueue(2);
        queueByStack.enqueue(3);
        queueByStack.enqueue(4);

        System.out.println("Dequeue lần 1: " + queueByStack.dequeue());
        System.out.println("Dequeue lần 2: " + queueByStack.dequeue());
        System.out.println("Dequeue lần 3: " + queueByStack.dequeue());
    }
}
