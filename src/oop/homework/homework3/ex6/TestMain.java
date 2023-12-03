package oop.homework.homework3.ex6;

import homework.homework3.ex6.MyLinkedList;

public class TestMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        System.out.println("Sau khi thêm phần tử 1 vào đầu: ");
        myLinkedList.printList();

        myLinkedList.addAtTail(3);
        System.out.println("Sau khi thêm phần tử 3 vào cuối: ");
        myLinkedList.printList();

        myLinkedList.addAtIndex(1, 2);
        System.out.println("Sau khi thêm phần tử 2 vào index 1: ");
        myLinkedList.printList();

        System.out.println("Giá trị ở index 1: "+ myLinkedList.get(1));

        myLinkedList.deleteAtIndex(1);
        System.out.println("Sau khi xóa phần tử ở index 1: ");
        myLinkedList.printList();

        System.out.println("Giá trị ở index 1: ");
        System.out.println(myLinkedList.get(1));

    }
}
