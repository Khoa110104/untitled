package oop.final2022.expression;

public class TestExpressions {
    public static void main(String[] args) {
        /* TODO */
        /* Viết code đề mô tính biểu thức (1 + 2) * 3 - 4 */
        Evaluable one = new Operand(1);
        Evaluable two = new Operand(2);
        Evaluable three = new Operand(3);
        Evaluable four = new Operand(4);
        Evaluable add = new Expression(one, two, new AdditionOperator());
//        Evaluable addResult = new Operand(add.evaluate());
        Evaluable multi = new Expression(add, three, new MultiplicationOperator());
//        Evaluable multiResult = new Operand(multi.evaluate());
        Evaluable minus = new Expression(multi, four, new SubtractionOperator());
        System.out.println("(1 + 2) * 3 - 4 = " + minus.evaluate());
    }
}
