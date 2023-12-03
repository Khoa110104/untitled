package oop.homework.homework3.ex9;

import homework.homework3.ex9.LinkedList;

public class TestMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(3);
        System.out.println("Linked list:");
        linkedList.printList();
        System.out.println( "Số lần xuất hiện giá trị 1 là: "+ linkedList.count(1));
        System.out.println( "Số lần xuất hiện giá trị 2 là: "+ linkedList.count(2));
        System.out.println( "Số lần xuất hiện giá trị 3 là: "+ linkedList.count(3));
        System.out.println( "Số lần xuất hiện giá trị 4 là: "+ linkedList.count(4));
    }
}
