package oop.homework.homework3.ex5.removetoindex;

import homework.homework3.ex5.removetoindex.MyLinkedListNode;

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
    public  MyLinkedListNode removeAtHead(MyLinkedListNode headNode) {
        if (headNode != null) {
            MyLinkedListNode newNode = headNode;
            newNode = newNode.getNext();
            return newNode;
        }
        return null;
    }
    public  MyLinkedListNode removeAtIndex(MyLinkedListNode headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHead(headNode);
        }
        MyLinkedListNode currNode = headNode;
        MyLinkedListNode prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {
            if (count == index) {
                bIsFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
            count++;
        }
        if (bIsFound) {
            if (prevNode == null) {
                return null;
            } else {
                if (currNode != null) {
                    prevNode.setNext(currNode.getNext());
                }
            }
        }
        return headNode;
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
