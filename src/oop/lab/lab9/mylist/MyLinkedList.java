package oop.lab.lab9.mylist;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private MyLinkedListNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        this.checkBoundaries(index, size);
        MyLinkedListNode tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    @Override
    public void add(Object payload, int index) {
        this.checkBoundaries(index, size + 1);
        if (index == size) {
            add(payload);
        } else if (index == 0) {
            MyLinkedListNode currentNode = new MyLinkedListNode(payload, head);
            this.head = currentNode;
            size++;
        } else {
            MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
            MyLinkedListNode nextNode = this.getNodeByIndex(index);
            MyLinkedListNode currentNode = new MyLinkedListNode(payload, nextNode);
            prevNode.setNext(currentNode);
            size++;
        }

    }

    @Override
    public void add(Object payLoad) {
        if (size == 0) {
            this.head = new MyLinkedListNode(payLoad);
            size++;
        } else {
            MyLinkedListNode lastNode = this.getNodeByIndex(size - 1);
            MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
            lastNode.setNext(newNode);
            size++;
        }
    }

    @Override
    public void remove(int index) {
        this.checkBoundaries(index, size);
        if (index == 0) {
            if (size > 1) {
                this.head = head.getNext();
            } else {
                this.head = null;
            }
            size--;
            return;
        }
        if (index == size - 1) {
            MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
            prevNode.setNext(null);
            size--;
            return;
        }
        MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
        MyLinkedListNode nextNode = this.getNodeByIndex(index + 1);
        prevNode.setNext(nextNode);
        size--;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        this.checkBoundaries(index, size);
        return this.getNodeByIndex(index).getPayLoad();
    }
}
