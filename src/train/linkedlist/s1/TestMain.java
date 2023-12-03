package train.linkedlist.s1;

import static train.linkedlist.s1.MyLinkedList.*;

public class TestMain {
    public static void main(String[] args) {
        //Tạo list
        MyLinkedListNode node1 = new MyLinkedListNode(1);
        MyLinkedListNode node2 = new MyLinkedListNode(2);
        MyLinkedListNode node3 = new MyLinkedListNode(3);
        node1.setNext(node2);
        node2.setNext(node3);
        //In list
        printLinkedList(node1);
        //Thêm phần tử vào đầu list
         addToHead(node1, 0);
        printLinkedList(node1);
        //Thêm phần tử vào cuối list
        addToTail(node1, 5);
        printLinkedList(node1);
        //Thêm phần tử vào giữa list
        addToIndex(node1, 4, 4);
        printLinkedList(node1);
        //Xóa phần tử đầu list
        MyLinkedListNode newList = removeAtHead(node1);
        //Xóa phần tử cuối list
        MyLinkedListNode newList1 = removeAtTail(node1);
        printLinkedList(newList1);
        //Xóa phần tử ở giữa list
        removeAtIndex(node1, 0);
        printLinkedList(node1);
        //up
        addToIndex(node1, 3, 3);
        addToTail(node1, 5);
        printLinkedList(node1);
        //reverse list
        MyLinkedListNode reverseList = reverseList(node1);
        printLinkedList(reverseList);

    }
}
