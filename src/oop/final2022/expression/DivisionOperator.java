package oop.final2022.expression;

public class DivisionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        /* TODO */
        return leftOperand.evaluate() / rightOperand.evaluate();
    }
}
