package hw7_22001603_NguyenDangKhoa.practice2;

public class Node {
    public int element;
    public Node parent;
    public Node left;
    public Node right;

    public Node(int e,Node above, Node leftChild, Node rightChild) {
        element = e;
        parent = above;
        left = leftChild;
        right = rightChild;

    }
}