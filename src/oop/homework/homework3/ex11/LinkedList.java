package oop.homework.homework3.ex11;

import homework.homework3.ex11.LinkedListNode;

import java.util.Stack;

public class LinkedList {
    public LinkedListNode headNode;

    public void add(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            LinkedListNode current = headNode;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void reverseList(LinkedListNode headNode) {
        LinkedListNode currNode = headNode;
        while (currNode != null && currNode.getNext() != null) {
            LinkedListNode nextNode = currNode.getNext();
            currNode.setNext(nextNode.getNext());
            nextNode.setNext(headNode);
            headNode = nextNode;
        }
    }
    public boolean isPalindrome(LinkedListNode headNode) {
        if (headNode == null || headNode.getNext() == null) {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        LinkedListNode slow = headNode;
        LinkedListNode fast = headNode;
        while (fast != null && fast.getNext() != null) {
            stack.push(slow.getData());
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if (fast != null) {
            slow = slow.getNext();
        }
        while (slow != null) {
            int stackTop = stack.pop();
            if (stackTop != slow.getData()) {
                return false;
            }
            slow = slow.getNext();
        }
        return true;
    }
    public void printList() {
       LinkedListNode current = headNode;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
