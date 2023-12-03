package oop.hw7_22001603_NguyenDangKhoa.combo2.ex3;

import hw7_22001603_NguyenDangKhoa.combo2.ex2.BinarySearchTree;
import hw7_22001603_NguyenDangKhoa.combo2.ex2.Node;

public class BinarySearchTreeAVL extends BinarySearchTree {
    @Override

    public void insert(int x) {
        super.insert(x);
        root = balance(root);
    }

    @Override

    public void delete(int x) {
        super.delete(x);
        root = balance(root);
    }

    private Node rotateRight(Node node) {
        Node leftChild = node.left;
        if (leftChild != null) {
            node.left = leftChild.right;
            if (node.left != null)
                node.left.parent = node;
            leftChild.right = node;
            leftChild.right.parent = leftChild;
            return leftChild;
        }
        return node;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.right), height(node.left));
        }
    }

    private Node rotateLeft(Node node) {
        Node rightChild = node.right;
        if (rightChild != null) {
            node.right = rightChild.left;
            if (node.right != null) node.right.parent = node;
            rightChild.left = node;
            rightChild.left.parent = rightChild;
            return rightChild;
        }
        return node;
    }

    private int balanceFactor(Node node) {
        return node == null ? 0 : height(node.right) - height(node.left);
    }

    private Node balance(Node node) {

        int balance = balanceFactor(node);
        if (balance != 0) {
            if (balance > 1 && node.right != null) {
                if (balanceFactor(node.right) >= 0)
                    node = rotateLeft(node);
                else {
                    node.right = rotateRight(node.right);
                    node = rotateLeft(node);
                }
            } else if (balance < -1 && node.left != null) {
                if (balanceFactor(node.left) <= 0)
                    node = rotateRight(node);
                else {
                    node.left = rotateLeft(node.left);
                    node = rotateRight(node);
                }
            }
            if (node.left != null)
                node.left = balance(node.left);
            if (node.right != null)
                node.right = balance(node.right);
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTreeAVL tree = new BinarySearchTreeAVL();
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(6);
        tree.insert(4);
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.printTree();
        System.out.println("Size: " + tree.size());
        tree.delete(3);
        System.out.println("Sau khi xóa 3: ");
        tree.printTree();
        System.out.println("Size: " + tree.size());
        tree.delete(5);
        System.out.println("Xóa phần tử 8: ");
        tree.delete(8);
        System.out.println("Sau khi xóa 5 và thêm 13: ");
        tree.insert(13);
        tree.printTree();
        System.out.println("Size: " + tree.size());
    }
}
