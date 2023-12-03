package oop.homework.homework3.ex5.singlelinkedlist;

import homework.homework3.ex5.singlelinkedlist.MyLinkedListNode;

public class MyLinkedList {
    public MyLinkedListNode createNode(int payLoad) {
        MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
        return newNode;
    }

    public MyLinkedListNode addElement(MyLinkedListNode headNode, int payLoad) {
       MyLinkedListNode newNode = createNode(payLoad);
       headNode.setNext(newNode);
       return newNode;
    }

    public void printLinkedList(MyLinkedListNode headNode) {
        if (headNode == null) {
            System.out.println("List is empty!!");
        } else {
            MyLinkedListNode temp =headNode;
            while (temp != null) {
                System.out.print(temp.getPayLoad());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
