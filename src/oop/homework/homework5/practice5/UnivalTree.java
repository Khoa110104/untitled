package oop.homework.homework5.practice5;

public class UnivalTree {
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
    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {
        UnivalTree univalTree = new UnivalTree();
        univalTree.root = new TreeNode(1);
        univalTree.root.left = new TreeNode(1);
        univalTree.root.right = new TreeNode(1);
        univalTree.root.left.left = new TreeNode(1);
        univalTree.root.left.right = new TreeNode(1);
        univalTree.root.right.right = new TreeNode(1);
        System.out.println("Is Unival Tree: " + isUnivalTree(univalTree.root));
    }
}
