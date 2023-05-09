package oop.lab.lab9.polynomials;

public class ArrayPoly extends AbstractPoly{
    private double[] coefficients;

    public ArrayPoly() {
        coefficients = null;
    }
    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients[degree];
    }

    @Override
    public int degree() {
        return this.coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefficients = this.derive();
        return new ArrayPoly(derivativeCoefficients);
    }
}