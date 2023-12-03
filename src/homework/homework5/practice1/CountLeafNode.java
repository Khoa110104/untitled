package homework.homework5.practice1;

import java.util.Scanner;

public class CountLeafNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        System.out.print("Length: ");
        int length = scanner.nextInt();
        System.out.print("Element: ");
        for (int i = 0; i < length; i++) {
            int data = scanner.nextInt();
            tree.root = tree.insert(tree.root, data);
        }
        System.out.println("Number of leaves in the tree: " + tree.countLeafNode(tree.root));
    }
    public static class BinaryTree {

        class Node {
            private int data;
            private Node left;
            private Node right;

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        private Node root;

        public BinaryTree() {
            this.root = null;
        }

        public Node insert(Node currentNode, int data) {
            if (currentNode == null) {
                return new Node(data);
            }
            if (data < currentNode.data) {
                currentNode.left = insert(currentNode.left, data);
            } else {
                currentNode.right = insert(currentNode.right, data);
            }
            return currentNode;
        }

        public static boolean isLeafNode(Node currentNode) {
            return (currentNode.left == null && currentNode.right == null);
        }

        public static int countLeafNode(Node currentNode) {
            if (currentNode == null) {
                return 0;
            }
            if (isLeafNode(currentNode)) {
                return 1;
            }
            return countLeafNode(currentNode.left) + countLeafNode(currentNode.right);
        }

    }
}
