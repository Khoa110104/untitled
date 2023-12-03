package homework.homework3.ex14;


public class LinkedList {
    public LinkedListNode headNode;

    public void print() {
        if (headNode == null) {
            System.out.println("List is empty!!");
        } else {
            LinkedListNode temp = headNode;
            System.out.print("null<->");
            while (temp != null) {
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("<->");
                } else {
                    System.out.println("<->null");
                }
            }
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

    //Add
    public void addNode(LinkedListNode headNode, int position, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (headNode == null) {
            System.out.println("List is empty!!!");
            return;
        }
        LinkedListNode currentNode = headNode;
        int currentPosition = 0;
        while (currentPosition < position && currentNode != null) {
            currentNode = currentNode.getNext();
            currentPosition++;
        }
        if (currentPosition == position) {
            newNode.setPrev(currentNode);
            newNode.setNext(currentNode.getNext());
            if (currentNode.getNext() != null) {
                currentNode.getNext().setPrev(newNode);
            }
            currentNode.setNext(newNode);
        } else {
            System.out.println("Invalid location in the list.");
        }
    }

    //Remove
    public LinkedListNode removeAtIndex(LinkedListNode headNode, int x) {
        if (headNode == null) {
            System.out.print("List is empty!!!");
            return null;
        }
        LinkedListNode currentNode = headNode;
        if (x == 1) {
            headNode = currentNode.getNext();
            if (headNode != null) {
                headNode.setPrev(null);
            }
            return headNode;
        }
        int count = 1;
        while (count < x && currentNode!= null) {
            currentNode = currentNode.getNext();
            count++;
        }
        if (count == x && currentNode != null) {
            currentNode.getPrev().setNext(currentNode.getNext());
            if (currentNode.getNext() != null) {
                currentNode.getNext().setPrev(currentNode.getPrev());
            }
        } else {
            System.out.println("Invalid location in the list.");
        }
        return headNode;
    }

    //Sorted insert
    public LinkedListNode sortedInsert(LinkedListNode headNode, int x) {
        LinkedListNode newNode = new LinkedListNode(x);
        if (headNode == null || x < headNode.getData()) {
            newNode.setNext(headNode);
            if (headNode != null) {
                headNode.setPrev(newNode);
            }
            return newNode;
        }
        LinkedListNode currentNode = headNode;
        while (currentNode.getNext() != null && currentNode.getNext().getData() < x) {
            currentNode = currentNode.getNext();
        }
        newNode.setNext(currentNode.getNext());
        newNode.setPrev(currentNode);
        if (currentNode.getNext() != null) {
            currentNode.getNext().setPrev(newNode);
        }
        currentNode.setNext(newNode);
        return headNode;
    }
}
