package oop.homework.homework5.practice1;

import java.util.Scanner;

public class InOrderTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        BinaryTree tree = new BinaryTree();
        System.out.print("Element: ");
        for (int i = 0; i < length; i++) {
            int x = scanner.nextInt();
            tree.root = tree.insert(tree.root,x );
        }
        System.out.println("InOrderTraversal:");
        tree.printTree(tree.root);
    }

     public static class BinaryTree {
        Node root;

        class Node {
            private int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public BinaryTree() {
            this.root = null;
        }

        public Node insert(Node currentNode, int data) {
            if (currentNode == null) {
                return new Node(data);
            }
            if (data <= currentNode.data) {
                currentNode.left = insert(currentNode.left, data);
            } else {
                currentNode.right = insert(currentNode.right, data);
            }
            return currentNode;
        }

        public void printTree(Node current) {
            if (current != null) {
                printTree(current.left);
                System.out.print(current.data + " ");
                printTree(current.right);
            }
        }

    }
}