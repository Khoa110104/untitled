package oop.homework.homework3.ex5.addtoindex;


import homework.homework3.ex5.addtoindex.MyLinkedList;
import homework.homework3.ex5.addtoindex.MyLinkedListNode;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int n = scanner.nextInt();
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.print("Element: ");
        for (int i = 0 ; i < n; i++) {
            int payLoad = scanner.nextInt();
            MyLinkedListNode newNode = myLinkedList.createNode(payLoad);
            myLinkedList.addElement(newNode);
        }
        System.out.println("Add to index");
        System.out.print("Index: ");
        int x = scanner.nextInt();
        System.out.print("Value: ");
        int k = scanner.nextInt();
        myLinkedList.addToIndex(x, k);
        System.out.println("After add:");
        myLinkedList.printLinkedList(myLinkedList);
    }
}
