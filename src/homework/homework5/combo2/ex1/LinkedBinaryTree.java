package homework.homework5.combo2.ex1;

import java.io.*;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {
    public static class Node<E> {
        public E element;
        public Node<E> parent;
        public Node<E> left;
        public Node<E> right;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;

        }
    }

    private Node<E> root;
    private int size;

    public LinkedBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public Node<E> addRoot(E element) {
        if (root != null) {
            System.out.println("Tree has root already");
        }
        root = new Node<>(element, null, null, null);
        size++;
        return root;
    }

    public Node<E> addLeft(Node<E> p, E element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.left != null) {
            System.out.println("Left child already exists!!!");
        } else {
            p.left = new Node<>(element, p, null, null);
            size++;
        }
        return p.left;
    }

    public Node<E> addRight(Node<E> p, E element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.right != null) {
            System.out.println("Right child already exists!!!");
        } else {
            p.right = new Node<>(element, p, null, null);
            size++;
        }
        return p.right;
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
        if (p == null) {
            System.out.println("Node unknown");
            return -1;
        }
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
        if (currentNode == root || p == null) {
            return null;
        }
        return (T) currentNode.parent;
    }

    @Override
    public T left(T p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }
        Node<E> currentNode = (Node<E>) p;
        if (currentNode.left == null) {
            System.out.println("There are no left children");
            return null;
        }
        return (T) currentNode.left;
    }

    @Override
    public T right(T p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }
        Node<E> currentNode = (Node<E>) p;
        return (T) currentNode.right;
    }

    @Override
    public T sibling(T p) {
        Node<E> currentNode = (Node<E>) p;
        Node<E> parentNode = currentNode.parent;
        if (parentNode != null && parentNode.left != null && parentNode.right != null) {
            if (parentNode.left == currentNode) {
                return (T) parentNode.right;
            } else {
                return (T) parentNode.left;
            }
        }
        return null;
    }

    public void printTree() {
        System.out.println("Linked Binary Tree:");
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

public void printTreeToFile(String fileName) {
    try (FileWriter fileWriter = new FileWriter(fileName);
         PrintWriter printWriter = new PrintWriter(fileWriter)) {
        printWriter.println("Linked Binary Tree: ");
        printTreeToFile(root, 0, printWriter);
        System.out.println("Cây nhị phân được lưu vào: " + fileName);
    } catch (IOException exception) {
        exception.printStackTrace();
    }
}

    public void printTreeToFile(Node<E> currNode, int depth, PrintWriter writer) {
        if (currNode == null) {
            return;
        }
        printTreeToFile(currNode.right, depth + 1, writer);
        for (int i = 0; i < depth; i++) {
            writer.print("    ");
        }
        writer.println(currNode.element);
        printTreeToFile(currNode.left, depth + 1, writer);
    }


    public static void main(String[] args) {
        System.out.println("--------------------BinarySearchAVLTree--------------------");
        LinkedBinaryTree<Integer, LinkedBinaryTree.Node<Integer>> linkedTree = new LinkedBinaryTree<>();
        linkedTree.root = linkedTree.addRoot(1);
        LinkedBinaryTree.Node<Integer> L = linkedTree.addLeft(linkedTree.root, 2);
        LinkedBinaryTree.Node<Integer> R = linkedTree.addRight(linkedTree.root, 3);
        LinkedBinaryTree.Node<Integer> RL = linkedTree.addLeft(R, 6);
        LinkedBinaryTree.Node<Integer> LL = linkedTree.addLeft(L, 4);
        LinkedBinaryTree.Node<Integer> LR = linkedTree.addRight(L, 5);
        String fileName = "C:\\Learning\\java1\\dsa\\src\\homework\\homework5\\combo2\\ex1\\output2.txt";
        linkedTree.printTreeToFile(fileName);

        linkedTree.printTree();
        System.out.println("Size is: " + linkedTree.size());
        System.out.println("Root is: " + linkedTree.root().element);
        System.out.println("Empty is: " + linkedTree.isEmpty());
        System.out.println("Number of children of element 2 is: " + linkedTree.numChildren(L));
        System.out.println("Number of children of element 3 is: " + linkedTree.numChildren(R));
        System.out.println("Parent of element 3 is: " + linkedTree.parent(R).element);
        System.out.println("Left child of element 3 is: " + linkedTree.left(R).element);
        if (linkedTree.sibling(LL) != null) {
            System.out.println("Sibling of element 4 is: " + linkedTree.sibling(LL).element);
        } else {
            System.out.println("Sibling of element 4 is: " + linkedTree.sibling(LL));
        }

    }
}
