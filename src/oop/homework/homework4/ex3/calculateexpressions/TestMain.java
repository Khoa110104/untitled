package oop.homework.homework4.ex3.calculateexpressions;

import homework.homework4.ex3.calculateexpressions.Calculate;

public class TestMain {
    public static void main(String[] args) {
        String expression1 = "(1 + ((2 + 3) * (8 * 5)))";
        String expression2 = "(5 - (8 - 4) * (2 + 3)) + (8/4)";
        System.out.println("Biểu thức 1:");
        try {
            int result1 = Calculate.calculateExpression(expression1);
            System.out.println(expression1 + " = " + result1);
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
        }

        System.out.println("Biểu thức 2:");
        try {
            int result2 = Calculate.calculateExpression(expression2);
            System.out.println(expression2 + " = " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi trong biểu thức 2: " + e.getMessage());
        }
    }
}
