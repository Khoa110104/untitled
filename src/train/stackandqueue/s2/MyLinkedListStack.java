package train.stackandqueue.s2;

import java.util.Iterator;

public class MyLinkedListStack<T> implements Stack<T> {
    class Node {
        Node next;
        T data;
    }

    private Node list;
    private int size;

    @Override
    public void push(T data) {
        Node node = new Node();
        node.data = data;
        node.next = list;
        list = node;
        size++;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            T data = list.data;
            list = list.next;
            size--;
            return data;
        }
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return list.data;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListStackIterator();
    }

    class LinkedListStackIterator implements Iterator<T> {
        private Node current = list;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new MyLinkedListStack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        for (int i : stack) {
            System.out.println(i + "");
        }
        System.out.println();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
        for (int i : stack) {
            System.out.println(i + " ");
        }
    }
}
