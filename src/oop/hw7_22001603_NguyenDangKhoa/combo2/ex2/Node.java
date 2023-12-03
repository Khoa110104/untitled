package oop.hw7_22001603_NguyenDangKhoa.combo2.ex2;

public class Node {
    public int element;
    public Node parent;
    public Node left;
    public Node right;

    public Node(int element) {
        this.element = element;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public Node(int e, Node above, Node leftChild, Node rightChild) {
        element = e;
        parent = above;
        left = leftChild;
        right = rightChild;

    }
}