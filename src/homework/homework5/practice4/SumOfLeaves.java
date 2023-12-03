package homework.homework5.practice4;

public class SumOfLeaves {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public TreeNode(int data,TreeNode left,TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    private TreeNode root;
    public static boolean isLeave(TreeNode node) {
        if (node == null) {
            return false;
        }
        return node.left == null && node.right == null;
    }
    public static int sumOfLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (isLeave(root))
            result += root.data;
        result += sumOfLeaves(root.left);
        result += sumOfLeaves(root.right);
        return result;
    }

    public static void main(String[] args) {
        SumOfLeaves sumOfLeaves = new SumOfLeaves();
        sumOfLeaves.root = new TreeNode(3);
        sumOfLeaves.root.left = new TreeNode(9);
        sumOfLeaves.root.right = new TreeNode(20);
        sumOfLeaves.root.right.left = new TreeNode(15);
        sumOfLeaves.root.right.right = new TreeNode(7);
        System.out.println("Sum of leaves in tree is: " + sumOfLeaves(sumOfLeaves.root));
    }

}
