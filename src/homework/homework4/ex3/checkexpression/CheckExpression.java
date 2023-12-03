package homework.homework4.ex3.checkexpression;

import java.util.Stack;

public class CheckExpression {
    public boolean checkExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{') {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')' || expression.charAt(i) == ']' || expression.charAt(i) == '}') {
                if (stack.isEmpty() || expression.charAt(i) == ')' && stack.peek() != '('
                        || expression.charAt(i) == ']' && stack.peek() != '['
                        || expression.charAt(i) == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
