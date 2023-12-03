package train.linkedlist.s1;

public class MyLinkedListNode {
    private Object payLoad;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payLoad) {
        this.payLoad = payLoad;
        this.next = null;
    }

    public MyLinkedListNode(Object payLoad, MyLinkedListNode next) {
        this.payLoad = payLoad;
        this.next = next;
    }

    public Object getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Object payLoad) {
        this.payLoad = payLoad;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
