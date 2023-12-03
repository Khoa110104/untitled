package oop.homework.homework3.ex8;

import homework.homework3.ex8.LinkedListNode;

public class LinkedList {
    private LinkedListNode headNode;

    public LinkedList() {
    }
    public void add(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            LinkedListNode current = headNode;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public int getCount(){
        if (headNode == null) {
            return 0;
        }
        LinkedListNode current = headNode;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
    public void printNthFromLast(int n) {
        int length = getCount();
        if (n > length) {
            return;
        }
        LinkedListNode current = headNode;
        for (int i =1; i < length - n + 1; i++) {
            current = current.getNext();
        }
        System.out.println("Giá trị phần tử thứ " + n +" từ cuối là: " +current.getData());
    }
    public void printList() {
        LinkedListNode current = headNode;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
