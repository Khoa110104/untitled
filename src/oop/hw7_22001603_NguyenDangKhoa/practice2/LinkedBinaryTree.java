package oop.hw7_22001603_NguyenDangKhoa.practice2;

import hw7_22001603_NguyenDangKhoa.practice2.BinaryTreeInterface;
import hw7_22001603_NguyenDangKhoa.practice2.Node;

public class LinkedBinaryTree implements BinaryTreeInterface {


    private hw7_22001603_NguyenDangKhoa.practice2.Node root;
    private int size;

    public LinkedBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public hw7_22001603_NguyenDangKhoa.practice2.Node addRoot(int element) {
        if (root != null) {
            System.out.println("Tree has root already");
        }
        root = new hw7_22001603_NguyenDangKhoa.practice2.Node(element, null, null, null);
        size++;
        return root;
    }

    public hw7_22001603_NguyenDangKhoa.practice2.Node addLeft(hw7_22001603_NguyenDangKhoa.practice2.Node p, int element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.left != null) {
            System.out.println("Left child already exists!!!");
        } else {
            p.left = new hw7_22001603_NguyenDangKhoa.practice2.Node(element, p, null, null);
            size++;
        }
        return p.left;
    }

    public hw7_22001603_NguyenDangKhoa.practice2.Node addRight(hw7_22001603_NguyenDangKhoa.practice2.Node p, int element) {
        if (p == null) {
            System.out.println("Node unknown!!!");
            return null;
        }
        if (p.right != null) {
            System.out.println("Right child already exists!!!");
        } else {
            p.right = new hw7_22001603_NguyenDangKhoa.practice2.Node(element, p, null, null);
            size++;
        }
        return p.right;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.practice2.Node root() {
        if (!isEmpty()) {
            return root;
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
    public int numChildren(hw7_22001603_NguyenDangKhoa.practice2.Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return -1;
        }
        int childCount = 0;

        if (p.left != null) {
            childCount++;
        }
        if (p.right != null) {
            childCount++;
        }
        return childCount;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.practice2.Node parent(hw7_22001603_NguyenDangKhoa.practice2.Node p) {
        if (p == root || p == null) {
            return null;
        }
        return p.parent;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.practice2.Node left(hw7_22001603_NguyenDangKhoa.practice2.Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }

        if (p.left == null) {
            System.out.println("There are no left children");
            return null;
        }
        return p.left;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.practice2.Node right(hw7_22001603_NguyenDangKhoa.practice2.Node p) {
        if (p == null) {
            System.out.println("Node unknown");
            return null;
        }

        return p.right;
    }

    @Override
    public hw7_22001603_NguyenDangKhoa.practice2.Node sibling(hw7_22001603_NguyenDangKhoa.practice2.Node p) {
        hw7_22001603_NguyenDangKhoa.practice2.Node parentNode = p.parent;
        if (parentNode != null && parentNode.left != null && parentNode.right != null) {
            if (parentNode.left == p) {
                return parentNode.right;
            } else {
                return parentNode.left;
            }
        }
        return null;
    }

    public void printTree(hw7_22001603_NguyenDangKhoa.practice2.Node root) {
        System.out.println("Linked Binary Tree:");
        printTree(root, 0);
    }

    public void printTree(hw7_22001603_NguyenDangKhoa.practice2.Node currNode, int depth) {
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
    public hw7_22001603_NguyenDangKhoa.practice2.Node buildTree() {
        root = addRoot(1);
        hw7_22001603_NguyenDangKhoa.practice2.Node L = addLeft(root, 2);
        hw7_22001603_NguyenDangKhoa.practice2.Node R = addRight(root, 3);
        hw7_22001603_NguyenDangKhoa.practice2.Node RL = addLeft(R, 6);
        hw7_22001603_NguyenDangKhoa.practice2.Node LL = addLeft(L, 4);
        Node LR = addRight(L, 5);
        return root;
    }
}
