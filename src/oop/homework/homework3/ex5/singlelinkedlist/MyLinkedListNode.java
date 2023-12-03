package oop.homework.homework3.ex5.singlelinkedlist;

public class MyLinkedListNode {
    private int payLoad;
    private MyLinkedListNode next;

    public MyLinkedListNode() {
    }


    public MyLinkedListNode(int payLoad) {
        this.payLoad = payLoad;
        this.next = null;
    }

    public MyLinkedListNode(int payLoad, MyLinkedListNode next) {
        this.payLoad = payLoad;
        this.next = next;
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
