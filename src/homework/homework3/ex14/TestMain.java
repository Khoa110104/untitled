package homework.homework3.ex14;

public class TestMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //Add
        linkedList.addToTail(1);
        linkedList.addToTail(3);
        linkedList.addToTail(5);
        linkedList.addToTail(7);
        linkedList.addToTail(9);
        linkedList.addToTail(11);
        System.out.println("Before add: ");
        linkedList.print();
        linkedList.addNode(linkedList.headNode, 2, 100);
        System.out.println("After add(sau index 2, giá trị: 100): ");
        linkedList.print();

        //Remove
        System.out.println("Before remove: ");
        linkedList.print();
        linkedList.headNode = linkedList.removeAtIndex(linkedList.headNode, 4);
        System.out.println("After remove(vị trí thứ:4): ");
        linkedList.print();

        //Sorted insert
        System.out.println("Before sorted insert: ");
        linkedList.print();
        linkedList.headNode = linkedList.sortedInsert(linkedList.headNode, 8);
        System.out.println("After sorted insert(thêm  8): ");
        linkedList.print();
    }
}
