package oop.lab.lab9.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly{
    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        this.coefficients = new ArrayList<>();
        for (int i = 0; i < coeffs.length; i++) {
            this.coefficients.add(coeffs[i]);
        }
    }

    @Override
    public double[] coefficients() {
        double[] newArray = new double[this.coefficients.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.coefficients.get(i);
        }
        return newArray;

    }

    @Override
    public double coefficient(int degree) {
        return this.coefficients.get(degree);
    }

    @Override
    public int degree() {
        return this.coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivedCoeffs = this.derive();
        return new ListPoly(derivedCoeffs);
    }
}

