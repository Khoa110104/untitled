package oop.homework.homework4.ex2;

import homework.homework4.ex2.ArrayStack;
import homework.homework4.ex2.LinkedListStack;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("---------------LinkedListStack---------------");
        LinkedListStack linkedListStack = new LinkedListStack();
        System.out.println("Push: 1 -> 2 -> 3 -> 5");
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(5);
        linkedListStack.printList();
        System.out.println("Size:" + linkedListStack.getSize());
        System.out.println("Pop: " + linkedListStack.pop());
        linkedListStack.printList();
        System.out.println("Push: 10");
        linkedListStack.push(10);
        linkedListStack.printList();
        System.out.println("Top:" + linkedListStack.top());


        System.out.println("-----------------ArrayStack-----------------");
        ArrayStack arrayStack = new ArrayStack();
        System.out.println("Push: 1 -> 2 -> 3 -> 5");
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.print();
        System.out.println("Size: " + arrayStack.size());
        System.out.println("Pop: " + arrayStack.pop());
        arrayStack.print();
        System.out.println("Push: 10");
        arrayStack.push(10);
        arrayStack.print();
        System.out.println("Top: " + linkedListStack.top());
    }
}
