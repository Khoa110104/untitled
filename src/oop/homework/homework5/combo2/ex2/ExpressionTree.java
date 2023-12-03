package oop.homework.homework5.combo2.ex2;


import homework.homework5.combo2.ex2.LinkedBinaryTree;

public  class ExpressionTree<E> extends LinkedBinaryTree {

    public void preorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        System.out.print(p.element + " ");
        preorderPrint(p.left);
        preorderPrint(p.right);

    }

    public void postorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        postorderPrint(p.left);
        postorderPrint(p.right);
        System.out.print(p.element + " ");
    }

    public void inorderPrint(Node<E> p) {
        if (p == null) {
            return;
        }
        inorderPrint(p.left);
        System.out.print(p.element + " ");
        inorderPrint(p.right);
    }


    public Node<Character> initTree() {
        LinkedBinaryTree<Character, Node<Character>> linkedTree = new LinkedBinaryTree<>();
        Node<Character> rootNode = linkedTree.addRoot('*');
        Node<Character> L = linkedTree.addLeft(rootNode, '+');
        Node<Character> R = linkedTree.addRight(rootNode, '-');
        Node<Character> RL = linkedTree.addLeft(R, '7');
        Node<Character> RR = linkedTree.addRight(R, '4');
        Node<Character> LL = linkedTree.addLeft(L, '/');
        Node<Character> LLL  = linkedTree.addLeft(LL, '6');
        Node<Character> LLR  = linkedTree.addRight(LL, '3');
        Node<Character> LR  = linkedTree.addRight(L, '2');
        return rootNode;
    }

    public static void main(String[] args) {
        ExpressionTree expressionTree = new ExpressionTree();
        Node<Integer> tree = expressionTree.initTree();
        System.out.println("Biểu thức: (6/3 + 2) * (7 - 4)");
        System.out.println("Biểu thức trung tố:");
        expressionTree.inorderPrint(tree);
        System.out.println("\nBiểu thức tiền tố:");
        expressionTree.preorderPrint(tree);
        System.out.println("\nBiểu thức hậu tố:");
        expressionTree.postorderPrint(tree);
    }
}
