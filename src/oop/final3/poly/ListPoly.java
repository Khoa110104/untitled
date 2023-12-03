package oop.final3.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private List<Integer> coefficients;

    public ListPoly(int[] coefficients) {
        degree = coefficients.length - 1;
        this.coefficients = new ArrayList<>();
        for (int i : coefficients) {
            this.coefficients.add(i);
        }
        reduce();
    }

    @Override
    public int coefficient(int i) {
        return coefficients.get(i);
    }

    @Override
    public int[] coefficients() {
        int[] poly = new int[degree + 1];
        for (int i = 0; i <= degree; i++) {
            poly[i] = coefficient(i);
        }
        return poly;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(differentiate());
    }

    public ListPoly minus(ListPoly listPoly) {
        int[] resultCoefficients = Arrays.copyOf(coefficients(), Math.max(degree, listPoly.degree) + 1);
        for (int i = 0; i <= listPoly.degree; i++) {
            resultCoefficients[i] -= listPoly.coefficient(i);
        }
        return new ListPoly(resultCoefficients);
    }

    public ListPoly plus(ListPoly listPoly) {
        int[] resultCoefficients = Arrays.copyOf(coefficients(), Math.max(degree, listPoly.degree) + 1);
        for (int i = 0; i <= listPoly.degree; i++) {
            resultCoefficients[i] += listPoly.coefficient(i);
        }
        return new ListPoly(resultCoefficients);
    }

    private void reduce() {
        while (degree > 0 && coefficient(degree) == 0) {
            degree--;
        }
    }

    public ListPoly times(ListPoly listPoly) {
        int[] resultCoefficients = new int[degree + listPoly.degree + 1];
        for (int i = 0; i <= degree; i++) {
            for (int j = 0; j <= listPoly.degree; j++) {
                resultCoefficients[i + j] += coefficient(i) * listPoly.coefficient(j);
            }
        }
        return new ListPoly(resultCoefficients);
    }

    public String type() {
        return "ListPoly";
    }
}
