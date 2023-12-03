package oop.homework.homework3.ex10;

import homework.homework3.ex10.MyLinkedListNode;

public class MyLinkedList<T> {
    public MyLinkedListNode headNode;

    public MyLinkedListNode addToTail(MyLinkedListNode headNode, T payLoad) {
        MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
        if (headNode == null) {
            return newNode;
        } else {
            MyLinkedListNode lastNode = headNode;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
        return headNode;
    }

    public MyLinkedListNode reverseList(MyLinkedListNode headNode) {
        MyLinkedListNode currNode = headNode;
        while (currNode != null && currNode.getNext() != null) {
            MyLinkedListNode nextNode = currNode.getNext();
            currNode.setNext(nextNode.getNext());
            nextNode.setNext(headNode);
            headNode = nextNode;
        }
        return headNode;
    }

    public void printLinkedList(MyLinkedListNode head) {
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            MyLinkedListNode temp = head;
            while (temp != null) {
                System.out.print(temp.getPayLoad());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
