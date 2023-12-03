package homework.homework5.practice10;

public class TreesOverlap {
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
    public static boolean isIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null){
            return (root1.data == root2.data && isIdentical(root1.left, root2.left)&& isIdentical(root1.right, root2.right));
        }
        return false;
    }

    public static void main(String[] args) {
        TreesOverlap treesOverlap = new TreesOverlap();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right  = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right  = new TreeNode(4);
        System.out.println("Hai cây trùng nhau: " + isIdentical(root1, root2));
    }
}
