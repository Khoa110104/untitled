package oop.homework.homework4.ex3.checkexpression;

import homework.homework4.ex3.checkexpression.CheckExpression;

public class TestMain {
    public static void main(String[] args) {
        CheckExpression checkExpression = new CheckExpression();

        String validExp1 = "(a − b) ∗ (c + d)";
        String validExp2 = "(10 + 8)/((5 − 2) ∗ 17)";
        String invalidExp1 = "(a + b) ∗ c − d)";
        String invalidExp2 = "(10 − 8/((2 + 5) ∗ 17)";
        String invalidExp3 = ")u - v) * (m + n)";

        System.out.println(validExp1 + " is: " + checkExpression.checkExpression(validExp1));
        System.out.println(validExp2 + " is: " + checkExpression.checkExpression(validExp2));
        System.out.println(invalidExp1 + " is: " + checkExpression.checkExpression(invalidExp1));
        System.out.println(invalidExp2 + " is: " + checkExpression.checkExpression(invalidExp2));
        System.out.println(invalidExp3 + " is: " + checkExpression.checkExpression(invalidExp3));

    }
}
