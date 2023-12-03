package train.linkedlist.s1;

public class MyLinkedList {
    public static void printLinkedList(MyLinkedListNode head) {
        if (head == null) {
            System.out.println("List is empty!!");
        } else {
            MyLinkedListNode temp = head;
            while (temp != null) {
                System.out.print(temp.getPayLoad());
                temp = temp.getNext();
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    //Thêm phần tử vào đầu list
    public static MyLinkedListNode addToHead(MyLinkedListNode headNode, Object payLoad) {
        MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
        if (headNode != null) {
            newNode.setNext(headNode);
            headNode = newNode;
            return headNode;
        }
        return newNode;
    }

    //Thêm phần tử vào cuối
    public static MyLinkedListNode addToTail(MyLinkedListNode headNode, Object payLoad) {
        MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
        if (headNode == null) {
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

    //Thêm phần tử vào giữa
    public static MyLinkedListNode addToIndex(MyLinkedListNode headNode, Object payLoad, int index) {
        if (index == 0) {
            addToHead(headNode, payLoad);
        } else {
            MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
            MyLinkedListNode currNode = headNode;
            int count = 0;
            while (currNode != null) {
                count++;
                if (count == index) {
                    newNode.setNext(currNode.getNext());
                    currNode.setNext(newNode);
                    break;
                }
                currNode = currNode.getNext();
            }
        }
        return headNode;
    }

    //Xóa phần tử ở đầu list
    public static MyLinkedListNode removeAtHead(MyLinkedListNode headNode) {
        if (headNode != null) {
            MyLinkedListNode newNode = headNode;
            newNode = newNode.getNext();
            return newNode;
        }
        return null;
    }

    //Xóa phần tử ở cuối list
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

    //Xóa phần tử ở giũa list
    public static MyLinkedListNode removeAtIndex(MyLinkedListNode headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHead(headNode);
        }
        MyLinkedListNode currNode = headNode;
        MyLinkedListNode prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (currNode != null) {
            if (count == index) {
                bIsFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
            count++;
        }
        if (bIsFound) {
            if (prevNode == null) {
                return null;
            } else {
                if (currNode != null) {
                    prevNode.setNext(currNode.getNext());
                }
            }
        }
        return headNode;
    }

    //Đảo ngược list
    public static MyLinkedListNode reverseList(MyLinkedListNode headNode) {
        MyLinkedListNode currNode = headNode;
        while (currNode != null && currNode.getNext() != null) {
            MyLinkedListNode nextNode = currNode.getNext();
            currNode.setNext(nextNode.getNext());
            nextNode.setNext(headNode);
            headNode = nextNode;
        }
        return headNode;
    }
}
