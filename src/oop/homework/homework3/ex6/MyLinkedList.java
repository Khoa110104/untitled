package oop.homework.homework3.ex6;

public class MyLinkedList {
    class LinkedListNode {
        int value;
        LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private LinkedListNode headNode;
    private int size;

    public MyLinkedList() {
        headNode =null;
        size = 0;

    }

    public int get(int index) {
        if (index < -1 || index >= size) {
            return -1;
        }
        LinkedListNode currentNode = headNode;
        for (int i = 0 ; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public void addAtHead(int value) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
        size++;
    }

    public void addAtTail(int value) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (headNode == null) {
            headNode = newNode;
        } else {
            LinkedListNode current = headNode;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int value) {
        if (index < 0 || index >size) {
            return;
        }
        if (index == 0) {
            addAtHead(value);
        } else {
            LinkedListNode newNode = new LinkedListNode(value);
            LinkedListNode current = headNode;
            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >=size) {
            return;
        }
        if (index ==0) {
            headNode = headNode.next;
        } else {
            LinkedListNode current = headNode;
            for (int i = 0; i < index -1;i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public void printList() {
        LinkedListNode current = headNode;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
