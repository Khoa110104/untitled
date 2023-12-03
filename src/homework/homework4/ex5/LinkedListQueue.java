package homework.homework4.ex5;

import java.util.Iterator;

public class LinkedListQueue<E> {
    public class Node{
        E element;
        Node next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
    Node headNode;
    Node tailNode;
    int size;

    public LinkedListQueue() {
        this.headNode = null;
        this.tailNode = null;
    }

    public void enqueue(E element) {
        Node newNode = new Node(element);
        if(isEmpty()) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E temp = headNode.element;
        if (headNode == tailNode) {
            headNode =null;
            tailNode = null;
        } else {
            headNode = headNode.next;
        }
        size--;
        return temp;
    }

    public boolean isEmpty() {
        return (headNode == null&& tailNode == null);
    }
    public int getSize() {
        return size;
    }

    public Iterator<E> iterator() {
        return new QueueIterator();
    }
    class QueueIterator implements Iterator<E> {
        private Node currentNode = headNode;

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
    public void printList(){
        System.out.print("Queue: [ ");
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
}
