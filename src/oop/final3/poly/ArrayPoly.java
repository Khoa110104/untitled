package oop.final3.poly;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        degree = coefficients.length - 1;
        this.coefficients = coefficients;
        reduce();
    }


    @Override
    public int coefficient(int i) {
        return coefficients[i];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(differentiate());
    }

    public ArrayPoly minus(ArrayPoly arrayPoly) {
        int[] resultCoefficients = Arrays.copyOf(coefficients(), Math.max(degree, arrayPoly.degree) + 1);
        for (int i = 0; i <= arrayPoly.degree; i++) {
            resultCoefficients[i] -= arrayPoly.coefficient(i);
        }
        return new ArrayPoly(resultCoefficients);
    }

    public ArrayPoly plus(ArrayPoly arrayPoly) {
        int[] resultCoefficients = Arrays.copyOf(coefficients(), Math.max(degree, arrayPoly.degree) + 1);
        for (int i = 0; i <= arrayPoly.degree; i++) {
            resultCoefficients[i] += arrayPoly.coefficient(i);
        }
        return new ArrayPoly(resultCoefficients);
    }

    private void reduce() {
        while (degree > 0 && coefficient(degree) == 0) {
            degree--;
        }
    }

    public ArrayPoly times(ArrayPoly arrayPoly) {
        int[] resultCoefficients = new int[degree + arrayPoly.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= arrayPoly.degree; j++) {
                resultCoefficients[i + j] += coefficient(i) * arrayPoly.coefficient(j);
            }
        }
        return new ArrayPoly(resultCoefficients);
    }

    public String type() {
        return "ArrayPoly";
    }
}
