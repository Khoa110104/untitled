package oop.midterm2022.a3.poly;

import java.util.Arrays;

/**
 * Class representing a polynomial with coefficients stored as on array of int
 */
public class ArrayPolynomial extends AbstractPolynomial {
    private double[] coefficients;

    public ArrayPolynomial(double[] coefficients) {
        /* TODO */
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
        degree = coefficients.length - 1;
        reduce();
    }
    private void reduce() {
        /* TODO */
        while (degree > 0 && coefficient(degree) == 0) {
            degree--;
        }
    }

    @Override
    public IPolynomial derivative() {
        /* TODO */
        return new ArrayPolynomial(differentiate());
    }

    @Override
    public IPolynomial integral() {
        /* TODO */
        return new ArrayPolynomial(integrate());
    }

    @Override
    public double coefficient(int degree) {
        /* TODO */
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        /* TODO */
        return Arrays.copyOf(coefficients, coefficients.length);
    }

    public String type() {
        return "Array Poly";
    }

    public ArrayPolynomial plus(ArrayPolynomial that) {
        /* TODO */
        double[] result = Arrays.copyOf(coefficients(), Math.max(coefficients.length, that.coefficients.length));
        for (int i = 0; i <= that.degree; i++) {
            result[i] += that.coefficient(i);
        }
        return new ArrayPolynomial(result);
    }

    public ArrayPolynomial minus(ArrayPolynomial that) {
        /* TODO */
        double[] result = Arrays.copyOf(coefficients(), Math.max(coefficients.length, that.coefficients.length));
        for (int i = 0; i <= that.degree; i++) {
            result[i] -= that.coefficient(i);
        }
        return new ArrayPolynomial(result);
    }

    public ArrayPolynomial times(ArrayPolynomial that) {
        /* TODO */
        double[] result = new double[degree + that.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= that.degree; j++) {
                result[i + j] += coefficient(i) * that.coefficient(j);
            }
        }
        return new ArrayPolynomial(result);
    }
}
