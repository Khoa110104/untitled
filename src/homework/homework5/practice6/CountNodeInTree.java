package homework.homework5.practice6;

public class CountNodeInTree {
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

    public static int countNodeInTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = 0, b = 0;
        a += countNodeInTree(root.left);
        b += countNodeInTree(root.right);
        return a + b + 1;
    }

    public static void main(String[] args) {
        CountNodeInTree countNodeInTree = new CountNodeInTree();
        countNodeInTree.root = new TreeNode(1);
        countNodeInTree.root.left = new TreeNode(2);
        countNodeInTree.root.right = new TreeNode(3);
        countNodeInTree.root.left.left = new TreeNode(4);
        countNodeInTree.root.left.right = new TreeNode(5);
        countNodeInTree.root.right.right = new TreeNode(1);
        System.out.println("Số phần tử của cây: " + countNodeInTree(countNodeInTree.root));
    }
}
