package oop.homework.homework5.practice7;

import java.util.LinkedList;
import java.util.Queue;

public class CountNonLeaf {
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
    public static int countNonLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            boolean isInternal = false;
            if (currentNode.left != null) {
                isInternal = true;
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                isInternal = true;
                queue.add(currentNode.right);
            }
            if (isInternal) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNonLeaf countNonLeaf = new CountNonLeaf();
        countNonLeaf.root = new TreeNode(1);
        countNonLeaf.root.left = new TreeNode(2);
        countNonLeaf.root.right = new TreeNode(3);
        countNonLeaf.root.left.left = new TreeNode(4);
        countNonLeaf.root.left.left.left = new TreeNode(4);
        countNonLeaf.root.left.right = new TreeNode(5);
        countNonLeaf.root.right.right = new TreeNode(1);
        System.out.println("Số các phần tử không là lá: " + countNonLeaf(countNonLeaf.root));
    }
}
