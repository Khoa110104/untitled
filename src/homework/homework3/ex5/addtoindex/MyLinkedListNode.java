package homework.homework3.ex5.addtoindex;

public class MyLinkedListNode {
    private int payLoad;
    private MyLinkedListNode next;

    public MyLinkedListNode(int payLoad) {
        this.payLoad = payLoad;
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
