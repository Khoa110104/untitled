package oop.homework.homework3.ex14;

public class LinkedListNode {
    private int data;
    private LinkedListNode next;
    private LinkedListNode prev;

    public LinkedListNode(int data) {
        this.data = data;
        prev = next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }
}
