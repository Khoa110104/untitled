package homework.homework3.ex8;

public class TesMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println("Linked list:");
        linkedList.printList();
        linkedList.printNthFromLast(5);
    }
}
