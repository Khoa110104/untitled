package oop.midterm2022.a3.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as a list
 */
public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    public ListPolynomial(double[] coefficients) {
        /* TODO */
        this.coefficients = new ArrayList<>();
        for (double coef : coefficients) {
            this.coefficients.add(coef);
        }
        degree = coefficients.length - 1;
        reduce();
    }

    // giảm bậc về bậc thật sự của đa thức
    private void reduce() {
        while (degree > 0 && coefficient(degree) == 0) {
            degree--;
        }
    }

    @Override
    public IPolynomial derivative() {
        /* TODO */
        return new ListPolynomial(differentiate());
    }

    @Override
    public IPolynomial integral() {
        /* TODO */
        return new ListPolynomial(integrate());
    }

    @Override
    public double coefficient(int degree) {
        /* TODO */
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        /* TODO */
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }

    public String type() {
        return "List Poly";
    }

    public ListPolynomial plus(ListPolynomial that) {
        /* TODO */
        double[] result = Arrays.copyOf(coefficients(), Math.max(coefficients.size(), that.coefficients.size()));
        for (int i = 0; i <= that.degree; i++) {
            result[i] += that.coefficient(i);
        }
        return new ListPolynomial(result);
    }

    public ListPolynomial minus(ListPolynomial that) {
        /* TODO */
        double[] result = Arrays.copyOf(coefficients(), Math.max(coefficients.size(), that.coefficients.size()));
        for (int i = 0; i <= that.degree; i++) {
            result[i] -= that.coefficient(i);
        }
        return new ListPolynomial(result);
    }

    public ListPolynomial times(ListPolynomial that) {
        /* TODO */
        double[] result = new double[degree + that.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= that.degree; j++) {
                result[i + j] += coefficient(i) * that.coefficient(j);
            }
        }
        return new ListPolynomial(result);
    }
}

