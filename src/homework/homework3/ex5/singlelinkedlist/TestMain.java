package homework.homework3.ex5.singlelinkedlist;


import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int n = scanner.nextInt();
        System.out.print("Element:");
        int payLoad = scanner.nextInt();
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedListNode headNode = new MyLinkedListNode(payLoad);
        MyLinkedListNode tempNode = headNode;
        for (int i = 1 ; i < n; i++) {
             payLoad = scanner.nextInt();
            tempNode =  myLinkedList.addElement(tempNode, payLoad);
        }
        System.out.println("Output:");
        myLinkedList.printLinkedList(headNode);
    }
}
