package homework.homework5.practice4;

public class SumOfLeftLeaves {
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
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.left != null && root.left.left == null && root.left.right==null){
            result = result + root.left.data;
        }
        result = result + sumOfLeftLeaves(root.left);
        result = result + sumOfLeftLeaves(root.right);
        return result;
    }

    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        sumOfLeftLeaves.root = new TreeNode(3);
        sumOfLeftLeaves.root.left = new TreeNode(9);
        sumOfLeftLeaves.root.right = new TreeNode(20);
        sumOfLeftLeaves.root.right.left = new TreeNode(15);
        sumOfLeftLeaves.root.right.right = new TreeNode(7);

        System.out.println("Sum of left leaves in tree is: " + sumOfLeftLeaves(sumOfLeftLeaves.root));
    }
}
