package homework.homework5.combo2.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionBinaryTree {
    public static class BinaryTreeNode {
        private String value;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public BinaryTreeNode(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private static boolean isOperator(String s) {
         return s.equals("+") || s.equals("-")||s.equals("*") || s.equals("/");
//        return token.matches("[+\\-*/]");
    }

    private static boolean isOperand(String token) {
        if (token == null || token.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int operatorOrder(String operator) {
        switch (operator) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return 0;
        }
    }

    public static String[] inorderTopPostorder(String[] tokens) {
        Stack<String> stack = new Stack<>();
        List<String> postOrder = new ArrayList<>();
        for (String token : tokens) {
            if (isOperand(token)) {
                postOrder.add(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    String temp = stack.pop();
                    postOrder.add(temp);
                }
                stack.pop();
            } else if (isOperator(token)) {
                while (!stack.isEmpty() && isOperator(stack.peek()) && operatorOrder(token) <= operatorOrder(stack.peek())) {
                    String temp = stack.pop();
                    postOrder.add(temp);
                }
                stack.push(token);
            }
        }
        while (!stack.isEmpty()) {
            postOrder.add(stack.pop());
        }
        return postOrder.toArray(new String[0]);
    }

    public static BinaryTreeNode toExpressionTree(String[] list) {
        String[] tokens = inorderTopPostorder(list);
        Stack<BinaryTreeNode> stack = new Stack<>();
        for (String token : tokens) {
            BinaryTreeNode node = new BinaryTreeNode(token);
            if (isOperand(token)) {
                stack.push(node);
            } else if (isOperator(token)) {
                node.right = stack.pop();
                node.left = stack.pop();
                stack.push(node);
            }
        }
        return stack.pop();
    }
    public static void printTree(BinaryTreeNode root) {
        System.out.println("Expression Tree:");
        printTree(root, 0);
    }

    public static void printTree(BinaryTreeNode currNode, int depth) {
        if (currNode == null) {
            return;
        }
        printTree(currNode.right, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(currNode.value);
        printTree(currNode.left, depth + 1);
    }

    public static void main(String[] args) {
        System.out.println("Input:\nString [] tokens = {\"(\",\"6\",\"/\",\"3\",\"+\",\"2\",\")\",\"*\",\"(\",\"7\",\"-\",\"4\",\")\"}");

        String [] tokens = {"(","6", "/", "3","+","2",")", "*", "(", "7", "-", "4",")"};
//        tokens = inOrderToPostOrder(tokens);
        System.out.println("Output:");
        BinaryTreeNode root = toExpressionTree(tokens);
        printTree(root);
    }
}
