package hw7_22001603_NguyenDangKhoa.combo2.ex1;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void addTop(T data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.next = top;
            top = newNode;
        } else {
            top = bot = newNode;
        }
        n++;
    }

    public void addBot(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = bot = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }
        n++;
    }

    public T get(int i) {
        if (isEmpty()) {
            System.out.println("List is empty!!!");
            return null;
        }
        if (i < 0 || i >= n) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node currentNode = top;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }


    public void set(int i, T data) {
        if (i < 0 || i >= n) {
//            throw new IndexOutOfBoundsException("Index out of bounds");
            System.out.println("Index out of bounds");
            return;
        }
        Node currentNode = top;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }

    public boolean isContain(T data) {
        Node currentNode = top;
        for (int i = 0; i < n; i++) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T removeTop() {
        if (isEmpty()) {
//            throw new IllegalStateException("List is empty!!!");
            System.out.println("List is empty!!!");
            return null;
        }
        T dataTemp = top.data;
        top = top.next;
        n--;
        if (isEmpty()) {
            bot = null;
        }
        return dataTemp;
    }

    public T removeBot() {
        if (isEmpty()) {
//            throw new IllegalStateException("List is empty!!!");
            System.out.println("List is empty!!!");
            return null;
        }
        T dataTemp = bot.data;
        Node currentNode = top;
        if (n == 1) {
            top = bot = null;
        } else {
            while (currentNode.next != bot) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            bot = currentNode;
        }
        n--;
        return dataTemp;
    }

    public void remove(T data) {
        if (isEmpty()) {
//            throw new IllegalStateException("List is empty!!!");
            System.out.println("List is empty!!!");
            return;
        }
        if (top.data.equals(data)) {
            removeTop();
            return;
        }
        Node currentNode = top;
        while (currentNode.next != null && !currentNode.next.data.equals(data)) {
            currentNode = currentNode.next;
        }
        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            n--;
        }
        if (currentNode.next == null) {
            bot = currentNode;
            System.out.println("Does not exist");
        }
    }

    public void printLinkedList(SimpleLinkedList simpleLinkedList) {
        if (isEmpty()) {
            System.out.println("Lint is empty!!!");
        } else {
            Node current = top;
            while (current != null) {
                System.out.print(current.data);
                current = current.next;
                if (current != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
}

