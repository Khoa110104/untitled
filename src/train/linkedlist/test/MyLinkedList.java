package train.linkedlist.test;

public class MyLinkedList {
    public static void printLinkedList(MyLinkedListNode head) {
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            MyLinkedListNode temp = head;
            while (temp!= null) {
                System.out.println(temp.getPayload());
                temp = temp.getNext();
                if (temp!= null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public static MyLinkedListNode addToHead(MyLinkedListNode headNode, Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (headNode != null) {
            newNode.setNext(headNode);
        }
        return newNode;
    }
    public static MyLinkedListNode addToTail(MyLinkedListNode headNode, Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (headNode != null){
            return newNode;
        } else {
            MyLinkedListNode lastNode = headNode;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
        return headNode;
    }
    public static MyLinkedListNode addToIndex(MyLinkedListNode headNode, Object payload, int index) {
        if (index==0) {
            addToHead(headNode,payload);
        }else {
            MyLinkedListNode newNode = new MyLinkedListNode(payload);
            MyLinkedListNode currNode = headNode;
            int count = 0;
            while (currNode != null){
                count++;
                if (count==index) {
                    newNode.setNext(currNode.getNext());
                    currNode.setNext(newNode);
                    break;
                }
                currNode = currNode.getNext();
            }
        }
        return headNode;
    }
    public static MyLinkedListNode removeAtHead(MyLinkedListNode headNode) {
        if (headNode != null) {
            return headNode.getNext();
        }
        return null;
    }
    public static MyLinkedListNode removeAtTail(MyLinkedListNode headNode) {
        MyLinkedListNode lastNode = headNode;
        MyLinkedListNode prevNode = null;
        while (lastNode.getNext() != null) {
            prevNode = lastNode;
            lastNode = lastNode.getNext();
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.setNext(lastNode.getNext());
        }
        return headNode;
    }
    public static MyLinkedListNode removeAtIndex(MyLinkedListNode headNode, int index) {
        if (headNode == null || index <0) {
            return null;
        }
        if (index==0) {
            removeAtHead(headNode);
        }
        MyLinkedListNode currNode = headNode;
        MyLinkedListNode prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {
            if (count==index) {
                bIsFound =true;
                break;
            }
            prevNode=currNode;
            currNode = currNode.getNext();
            count++;
        }
        if (bIsFound) {
            if (prevNode == null) {
                return null;
            } else if (currNode != null) {
                prevNode.setNext(currNode.getNext());
            }
        }
        return headNode;
    }
    public static MyLinkedListNode reverseList(MyLinkedListNode headNode) {
        MyLinkedListNode currNode = headNode;
        while (currNode != null && currNode.getNext() != null) {
            MyLinkedListNode newNode = currNode.getNext();
            currNode.setNext(newNode.getNext());
            newNode.setNext(headNode);
            headNode = newNode;
        }
        return headNode;
    }
}
