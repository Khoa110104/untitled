package homework.homework5.combo2.ex2;


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
        LinkedBinaryTree<Character, LinkedBinaryTree.Node<Character>> linkedTree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<Character> rootNode = linkedTree.addRoot('*');
        LinkedBinaryTree.Node<Character> L = linkedTree.addLeft(rootNode, '+');
        LinkedBinaryTree.Node<Character> R = linkedTree.addRight(rootNode, '-');
        LinkedBinaryTree.Node<Character> RL = linkedTree.addLeft(R, '7');
        LinkedBinaryTree.Node<Character> RR = linkedTree.addRight(R, '4');
        LinkedBinaryTree.Node<Character> LL = linkedTree.addLeft(L, '/');
        LinkedBinaryTree.Node<Character> LLL  = linkedTree.addLeft(LL, '6');
        LinkedBinaryTree.Node<Character> LLR  = linkedTree.addRight(LL, '3');
        LinkedBinaryTree.Node<Character> LR  = linkedTree.addRight(L, '2');
        return rootNode;
    }

    public static void main(String[] args) {
        ExpressionTree expressionTree = new ExpressionTree();
        LinkedBinaryTree.Node<Integer> tree = expressionTree.initTree();
        System.out.println("Biểu thức: (6/3 + 2) * (7 - 4)");
        System.out.println("Biểu thức trung tố:");
        expressionTree.inorderPrint(tree);
        System.out.println("\nBiểu thức tiền tố:");
        expressionTree.preorderPrint(tree);
        System.out.println("\nBiểu thức hậu tố:");
        expressionTree.postorderPrint(tree);
    }
}
