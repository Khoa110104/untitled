package homework.homework5.practice17;

public class BoundaryTraversal {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void printLeaves(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }
    public static void printBoundaryLeft(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.print(root.data + " ");
            printBoundaryLeft(root.left);
        } else if (root.right != null) {
            System.out.print(root.data + " ");
            printBoundaryLeft(root.right);
        }
    }
    public static void printBoundaryRight(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            System.out.print(root.data + " ");
            printBoundaryRight(root.right);
        } else if (root.left != null) {
            System.out.print(root.data + " ");
            printBoundaryRight(root.left);
        }
    }
    public static void boundaryTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBoundaryLeft(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printBoundaryRight(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.left.right.left = new TreeNode(323);
        root.right.left.left = new TreeNode(222);
        root.right.right = new TreeNode(7);
        System.out.println("Duyệt theo biên: ");
        boundaryTraversal(root);
    }
}
