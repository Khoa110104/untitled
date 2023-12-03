package hw7_22001603_NguyenDangKhoa.practice2;

public interface BinaryTreeInterface {
    Node root();
    int size();
    boolean isEmpty();
    int numChildren(Node p);
    Node parent(Node p);
    Node left(Node p);
    Node right(Node p);
    Node sibling(Node p);
}
