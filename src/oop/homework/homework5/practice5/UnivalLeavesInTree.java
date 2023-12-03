package oop.homework.homework5.practice5;

import java.util.ArrayList;
import java.util.List;

public class UnivalLeavesInTree {
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
    public static List<Integer> values;
    private TreeNode root;
    public static boolean isLeaves(TreeNode currentNode) {
        if (currentNode == null) {
            return false;
        }
        return currentNode.left == null && currentNode.right == null;
    }
    public static void addValueLeaves(TreeNode root) {
        if (root == null) {
            return;
        }
        if (isLeaves(root)) {
            values.add(root.data);
        }
        addValueLeaves(root.left);
        addValueLeaves(root.right);
    }
    public static boolean isUnivalLeavesInTree(TreeNode root) {
        values = new ArrayList<>();
        addValueLeaves(root);
        for (int i : values) {
            if (values.get(0) != i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UnivalLeavesInTree univalLeavesInTree = new UnivalLeavesInTree();
        univalLeavesInTree.root = new TreeNode(1);
        univalLeavesInTree.root.left = new TreeNode(2);
        univalLeavesInTree.root.right = new TreeNode(1);
        univalLeavesInTree.root.left.left = new TreeNode(1);
        univalLeavesInTree.root.left.right = new TreeNode(1);
        univalLeavesInTree.root.right.right = new TreeNode(1);
        System.out.println("Các lá có cùng giá trị: " + isUnivalLeavesInTree(univalLeavesInTree.root));
    }
}
