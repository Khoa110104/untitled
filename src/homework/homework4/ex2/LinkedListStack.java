package homework.homework4.ex2;

import homework.homework3.ex6.MyLinkedList;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;


    }
    private Node stack = null;
    private int size;
    @Override
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

    @Override
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

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        } else {
            return stack.element;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;
        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
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

