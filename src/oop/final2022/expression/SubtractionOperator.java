package oop.final2022.expression;

public class SubtractionOperator implements Operator {
    @Override
    public double doOperation(Evaluable leftOperand, Evaluable rightOperand) {
        /* TODO */
        return leftOperand.evaluate() - rightOperand.evaluate();
    }
}
