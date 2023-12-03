package homework.homework3.ex10;

public class TestMain {
    public static void main(String[] args) {
        MyLinkedListNode myLinkedListNode1 = new MyLinkedListNode<>("one");

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addToTail(myLinkedListNode1, "two");
        myLinkedList.addToTail(myLinkedListNode1, "three");
        myLinkedList.addToTail(myLinkedListNode1, "four");
        myLinkedList.addToTail(myLinkedListNode1, "five");
        System.out.println("Before reverse:");
        myLinkedList.printLinkedList(myLinkedListNode1);
        myLinkedListNode1 = myLinkedList.reverseList(myLinkedListNode1);
        System.out.println("After reverse:");
        myLinkedList.printLinkedList(myLinkedListNode1);
    }
}
