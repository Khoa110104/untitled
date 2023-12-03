package homework.homework3.ex7;


public class TestMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(124);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(52);
        linkedList.add(5);
        System.out.println("Linked list:");
        linkedList.printList();
        System.out.println("Số phần tử của list là: " + linkedList.getCount());
    }
}
