package oop.homework.homework3.ex10;

public class MyLinkedListNode<T> {
    private T payLoad;
    private MyLinkedListNode next;

    public MyLinkedListNode(T payLoad) {
        this.payLoad = payLoad;
    }

    public MyLinkedListNode(T payLoad, MyLinkedListNode next) {
        this.payLoad = payLoad;
        this.next = next;
    }

    public T getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(T payLoad) {
        this.payLoad = payLoad;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
