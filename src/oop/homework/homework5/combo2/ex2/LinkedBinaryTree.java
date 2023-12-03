package oop.homework.homework5.combo2.ex2;

import homework.homework5.combo2.ex1.BinaryTreeInterface;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {
    public static class Node<E> {
        protected E element;
        protected Node<E> parent;
        protected Node<E> left;
        protected Node<E> right;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;

        }
    }

    public Node<E> root;
    public int size;

    public LinkedBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public Node<E> addRoot(E element) {
        if (!isEmpty()) {
            throw new IllegalStateException("Tree is not empty!!!");
        }
        root = new Node<>(element, null, null, null);
        size++;
        return root;
    }

    public Node<E> addLeft(Node<E> p, E element) {
        if (p.left != null) {
            throw new IllegalStateException("Left child already exists!!!");
        }
        Node<E> leftChild = new Node<>(element, p, null, null);
        p.left = leftChild;
        size++;
        return leftChild;
    }

    public Node<E> addRight(Node<E> p, E element) {
        if (p.right != null) {
            throw new IllegalStateException("Right child already exists!!!");
        }
        Node<E> rightNode = new Node<>(element, p, null, null);
        p.right = rightNode;
        size++;
        return rightNode;
    }

    @Override
    public T root() {
        if (!isEmpty()) {
            return (T) root;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int numChildren(T p) {
        int childCount = 0;
        Node<E> currentNode = (Node<E>) p;
        if (currentNode.left != null) {
            childCount++;
        }
        if (currentNode.right != null) {
            childCount++;
        }
        return childCount;
    }

    @Override
    public T parent(T p) {
        Node<E> currentNode = (Node<E>) p;
        if (currentNode == root) {
            return null;
        }
        return (T) currentNode.parent;
    }

    @Override
    public T left(T p) {
        Node<E> currentNode = (Node<E>) p;
        return (T) currentNode.left;
    }

    @Override
    public T right(T p) {
        Node<E> currentNode = (Node<E>) p;
        return (T) currentNode.right;
    }

    @Override
    public T sibling(T p) {
        Node<E> currentNode = (Node<E>) p;
        Node<E> parentNode =  currentNode.parent;
        if (parentNode != null) {
            if (parentNode.left == currentNode) {
                return (T) parentNode.right;
            }else {
                return (T) parentNode.left;
            }
        }
        return null;
    }

    public void printTree() {
        printTree(root, 0);
    }

    public void printTree(Node<E> currNode, int depth) {
        if (currNode == null) {
            return;
        }
        printTree(currNode.right, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(currNode.element);
        printTree(currNode.left, depth + 1);
    }

}
