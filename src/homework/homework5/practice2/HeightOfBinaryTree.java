package homework.homework5.practice2;

public class HeightOfBinaryTree {
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

    public Node newNode(int value) {
        return new Node(value);
    }

    public int getHeight(Node currentNode) {
        if (currentNode == null) {
            return -1;
        }
        return 1 + Math.max(getHeight(currentNode.left), getHeight(currentNode.right));
    }

    public static void main(String[] args) {
        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
        Node root = heightOfBinaryTree.newNode(5);
        root.left = heightOfBinaryTree.newNode(10);
        root.right = heightOfBinaryTree.newNode(15);
        root.left.left = heightOfBinaryTree.newNode(20);
        root.left.right = heightOfBinaryTree.newNode(25);
        root.left.right.right = heightOfBinaryTree.newNode(45);
        root.right.left = heightOfBinaryTree.newNode(30);
        root.right.right = heightOfBinaryTree.newNode(35);
        System.out.println("Height of Binary Tree is: "+heightOfBinaryTree.getHeight(root));
    }
}
