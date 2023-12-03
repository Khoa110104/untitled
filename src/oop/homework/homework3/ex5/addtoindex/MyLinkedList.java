package oop.homework.homework3.ex5.addtoindex;

import homework.homework3.ex5.addtoindex.MyLinkedListNode;

public class MyLinkedList {
    public MyLinkedListNode headNode;
    public MyLinkedListNode tailNode;

    public MyLinkedListNode createNode(int payLoad) {
        MyLinkedListNode node = new MyLinkedListNode(payLoad);
        return node;
    }

    public void addElement(MyLinkedListNode node) {
        if (headNode == null) {
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNext(node);
            tailNode = node;
        }
    }
    public void addToHead( int payLoad) {
        MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
        if (headNode != null) {
            newNode.setNext(headNode);
            headNode = newNode;
        } else {
            headNode = newNode;
        }
    }
    public void addToIndex( int index, int payLoad) {
        if (index == 0) {
            addToHead( payLoad);
        } else {
            MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
            MyLinkedListNode currNode = headNode;
            int count = 0;
            while (currNode != null) {
                count++;
                if (count == index) {
                    newNode.setNext(currNode.getNext());
                    currNode.setNext(newNode);
                    break;
                }
                currNode = currNode.getNext();
            }
        }
    }


    public void printLinkedList(MyLinkedList myLinkedList) {
        if (myLinkedList == null) {
            System.out.println("List is empty!!");
        } else {
            MyLinkedListNode temp = myLinkedList.headNode;
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
