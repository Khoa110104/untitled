package oop.homework.homework4.ex5;

import java.util.Iterator;

public class LinkedListStack<E> {
    class Node {
        E element;
        Node next;


    }
    private Node stack = null;
    private int size;
    public void push(E element) {
        Node newNode = new Node();
        newNode.element = element;
        if (stack == null) {
            stack = newNode;
        } else {
            newNode.next = stack;
            stack = newNode;
        }
        size++;

    }
    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node current = stack;
            stack = stack.next;
            size--;
            return current.element;
        }
    }

    public boolean isEmpty() {
        return size == 0 ;
    }


    public E top() {
        if (isEmpty()) {
            return null;
        } else {
            return stack.element;
        }
    }


    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        public boolean hasNext() {
            return currentNode != null;
        }


        public E next() {
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
    public void printList() {
        System.out.print("LinkedListStack: [ ");
        Node current = stack;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println("]");
    }
    public int getSize() {
        return size;
    }
}
