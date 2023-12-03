package train.doublelinkedlist;


public class LinkedList {
    private LinkedListNode headNode;
    public void print(LinkedListNode headNode) {
        if (headNode == null) {
            System.out.println("List is empty!!");
        } else {
            LinkedListNode temp = headNode;
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("<->");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public void addToHead(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.setNext(headNode);
            headNode.setPrev(newNode);
            headNode = newNode;
        }
    }
    public void addToTail(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        LinkedListNode currentNode = headNode;
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        newNode.setPrev(currentNode);
    }
    public void insertBefore(LinkedListNode nextNode, int data) {
        if (nextNode == null) {
            return;
        }
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.setPrev(nextNode.getPrev());
        nextNode.setPrev(newNode);
        newNode.setNext(nextNode);
        if (newNode.getPrev() != null) {
            newNode.getPrev().setNext(nextNode);
        } else {
            headNode = newNode;
        }
    }
    public void insertAfter(LinkedListNode prevNode, int data) {
        if (prevNode == null) {
            return;
        }
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        newNode.setPrev(prevNode);
        if (newNode.getNext() != null) {
            newNode.getNext().setPrev(newNode);
        }
    }
}
