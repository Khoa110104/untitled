package oop.final3.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public void add(Object obj) {
        add(obj, size);
    }

    @Override
    public void add(Object obj, int index) {
        if (!checkBoundaries(index, size)) {
            System.out.println("Can't add " + obj + " at index " + index);
            return;
        }
        if (head == null) {
            head = new MyLinkedListNode(obj);
            size++;
            return;
        }

        MyLinkedListNode tmp = head;
        while (--index > 0) {
            tmp = tmp.getNext();
        }
        MyLinkedListNode current = new MyLinkedListNode(obj, tmp.getNext());
        tmp.setNext(current);
        size++;
    }

    @Override
    public Object get(int index) {
        if (!checkBoundaries(index, size - 1)) {
            System.out.println("Can't get object at index " + index);
            return null;
        }
        MyLinkedListNode tmp = head;
        while (index-- > 0) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size - 1)) {
            System.out.println("Can't remove object at index " + index);
            return;
        }
        MyLinkedListNode tmp = head;
        while (--index > 0) {
            tmp = tmp.getNext();
        }
        tmp.setNext(tmp.getNext().getNext());
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
