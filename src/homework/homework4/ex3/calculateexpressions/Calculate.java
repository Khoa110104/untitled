package homework.homework4.ex3.calculateexpressions;

import java.util.Stack;

public class Calculate {
    public static boolean checkOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int operatorOrder(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static int simpleCalculation(int o1, int o2, char operator) {
        switch (operator) {
            case '+':
                return o1 + o2;
            case '-':
                return o1 - o2;
            case '*':
                return o1 * o2;
            case '/':
                if (o2 == 0) {
                    throw new ArithmeticException("Không thể chia cho:  0 !!!");
                }
                if (o1 == 0){
                    return 0;
                }
                return o1 / o2;
        }
        return 0;
    }

    public static int extractOperand(String expression, int index) {
        int operand = 0;
        while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
            operand = operand * 10 + (expression.charAt(index) - '0');
            index++;
        }
        return operand;
    }

    public static void handleParentheses(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
            char operator = operatorStack.pop();
            int o2 = operandStack.pop();
            int o1 = operandStack.pop();
            operandStack.push(simpleCalculation(o1, o2, operator));
        }
        if (!operatorStack.isEmpty()) {
            operatorStack.pop();
        } else {
            throw new ArithmeticException("Không hợp lệ!!!");
        }
    }

    public static void handleOperator(char c, Stack<Integer> operandStack, Stack<Character> operatorStack) {
        while (!operatorStack.isEmpty() && operatorOrder(c) <= operatorOrder(operatorStack.peek())) {
            char operator = operatorStack.pop();
            int o2 = operandStack.pop();
            int o1 = operandStack.pop();
            operandStack.push(simpleCalculation(o1, o2, operator));
        }
        operatorStack.push(c);
    }

    public static int calculateExpression(String expression) {

        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operandStack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                int operand = extractOperand(expression, i);
                operandStack.push(operand);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                handleParentheses(operandStack, operatorStack);
            } else if (checkOperator(c)) {
                handleOperator(c, operandStack, operatorStack);
            }
        }
        while (!operatorStack.isEmpty()) {
            char operator = operatorStack.pop();
            if (operandStack.size() < 2) {
                throw new ArithmeticException("Không hợp lệ!!!");
            }
            int o2 = operandStack.pop();
            int o1 = operandStack.pop();
            operandStack.push(simpleCalculation(o1, o2, operator));
        }
        if (operandStack.size() != 1) {
            throw new ArithmeticException("Không hợp lệ!!!");
        }
        return operandStack.pop();
    }

}


