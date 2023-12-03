package homework.homework4.ex4;

import java.util.Iterator;

public class LinkedListQueue<E> implements QueueInterface<E> {
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

    @Override
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

    @Override
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

    @Override
    public boolean isEmpty() {
        return (headNode == null&& tailNode == null);
    }
    public int getSize() {
        return size;
    }

    @Override
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

    public static void main(String[] args) {
        System.out.println("----------LinkedListQueue----------");
        LinkedListQueue linkedListQueue = new LinkedListQueue<>();
        System.out.println("Empty: " + linkedListQueue.isEmpty());
        System.out.println("Push: 1");
        linkedListQueue.enqueue(1);
        linkedListQueue.printList();
        System.out.println("Size: "+ linkedListQueue.getSize());
        System.out.println("Empty: " + linkedListQueue.isEmpty());
        System.out.println("Push: 2 -> 3 -> 4");
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.printList();
        System.out.println("Size: " + linkedListQueue.getSize());
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        linkedListQueue.printList();
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("Empty: " + linkedListQueue.isEmpty());
    }
}
