package oop.final3.mylist;

public class MyLinkedListNode {
    Object payload;
    MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public Object getPayload() {
        return payload;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return payload.toString();
    }
}
