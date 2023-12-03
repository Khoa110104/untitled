package homework.homework5.combo2.ex2;

public class CalculateExpressions {

    public CalculateExpressions() {
    }

    public  boolean checkOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    public boolean checkNumber(String str) {
//        return str.matches("\\d+");
        if (str == null) {
            return false;
        }
        try {
            if (!str.isEmpty()) {
                Double.parseDouble(str);
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    public double simpleCalculation(double o1, double o2, String operator) {
        switch (operator) {
            case "+":
                return o1 + o2;
            case "-":
                return o1 - o2;
            case "*":
                return o1 * o2;
            case "/":
                if (o2 == 0) {
                    throw new ArithmeticException("Không thể chia cho:  0 !!!");
                }
                if (o1 == 0) {
                    return 0;
                }
                return o1 / o2;
        }
        return 0;
    }

    public void calculate(LinkedBinaryTree.Node<String> currentNode) {
        if (currentNode == null)
            return;
        calculate(currentNode.left);
        calculate(currentNode.right);
        if (checkOperator(currentNode.element) && currentNode.left!= null && currentNode.right != null) {
            if (checkNumber(currentNode.left.element) && checkNumber(currentNode.right.element)) {
                double number1 = Double.parseDouble(currentNode.left.element);
                double number2 = Double.parseDouble(currentNode.right.element);
                currentNode.element = String.valueOf(simpleCalculation(number1, number2, currentNode.element));
                currentNode.left = currentNode.right = null;
            }
        }

    }
    public double calculateExpressions(LinkedBinaryTree tree) {
        while (!checkNumber((String) tree.root.element)) {
            calculate(tree.root);
        }
        return Double.parseDouble((String) tree.root.element);
    }
    public LinkedBinaryTree init() {
        LinkedBinaryTree<String, LinkedBinaryTree.Node<String>> linkedTree = new LinkedBinaryTree<>();
        linkedTree.root = linkedTree.addRoot("*");
        LinkedBinaryTree.Node<String> L = linkedTree.addLeft(linkedTree.root, "+");
        LinkedBinaryTree.Node<String> R = linkedTree.addRight(linkedTree.root, "-");
        LinkedBinaryTree.Node<String> RL = linkedTree.addLeft(R, "7");
        LinkedBinaryTree.Node<String> LL = linkedTree.addLeft(L, "/");
        LinkedBinaryTree.Node<String> LR = linkedTree.addRight(L, "2");
        LinkedBinaryTree.Node<String> RR = linkedTree.addRight(R, "4");
        LinkedBinaryTree.Node<String> LLL = linkedTree.addLeft(LL, "6");
        LinkedBinaryTree.Node<String> LLR = linkedTree.addRight(LL, "3");
        return linkedTree;
    }

    public static void main(String[] args) {
        CalculateExpressions calculateExpressions = new CalculateExpressions();
        LinkedBinaryTree linkedTree = calculateExpressions.init();
        System.out.print("(6/3 + 2) * (7 - 4) = ");
        System.out.println(calculateExpressions.calculateExpressions(linkedTree));
    }
}
