package hw7_22001603_NguyenDangKhoa.practice2;

public class CheckBinarySearchTree {
    public static int checkBinarySearchTree(Node root) {
        if (root == null)
            return 1;
        if (root.left != null && root.left.element >= root.element)
            return 0;
        if (root.right != null && root.right.element <= root.element)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        LinkedBinaryTree linkedBinaryTree = new LinkedBinaryTree();
        Node tree = linkedBinaryTree.buildTree();
        linkedBinaryTree.printTree(tree);
        System.out.println("Là cây nhị phân tìm kiếm không???(1:có, 0:không):\n" + checkBinarySearchTree(tree));
    }
}
