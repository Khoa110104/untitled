package homework.homework5.practice9;

public class SingleNode {
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
    private TreeNode root;
    public static void printSingleNode(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            printSingleNode(root.left);
            printSingleNode(root.right);
        } else if (root.right != null) {
            System.out.print(root.right.data + " ");
            printSingleNode(root.right);
        } else if (root.left != null) {
            System.out.print(root.left.data + " ");
            printSingleNode(root.left);
        }
    }

    public static void main(String[] args) {
        SingleNode singleNode = new SingleNode();
        singleNode.root = new TreeNode(1);
        singleNode.root.left = new TreeNode(2);
        singleNode.root.right = new TreeNode(3);
        singleNode.root.left.left = new TreeNode(4);
        singleNode.root.left.left.left = new TreeNode(4);
        singleNode.root.left.right = new TreeNode(5);
        singleNode.root.right.right = new TreeNode(1);
        System.out.println("Những node không có họ hàng: ");
        printSingleNode( singleNode.root);
    }
}
