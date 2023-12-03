package oop.lab.lab5.ex1_8;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i <= getDegree(); i++) {
            if (coeffs[coeffs.length - i - 1] != 0) {
                if (i == 0) {
                    s += coeffs[coeffs.length - i - 1];
                } else {
                    if (s.charAt(s.length() - 1) != '[') {
                        if (coeffs[coeffs.length - i - 1] > 0) {
                            s += " + ";
                        } else {
                            s += " - ";
                        }
                    }
                    s += Math.abs(coeffs[coeffs.length - i - 1]);
                    if (i == 1) {
                        s += "x";
                    } else {
                        s += "x^" + i;
                    }
                }
            }
        }
        return s;

    }

    public double evaluate(double x) {
        double polyVal = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyVal = polyVal * x + coeffs[i];
        }
        return polyVal;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (getDegree() < right.getDegree()) {
            coeffs = Arrays.copyOf(coeffs, right.getDegree() + 1);
        }
        for (int i = 0; i < right.getDegree() + 1; i++) {
            coeffs[i] += right.coeffs[i];
        }
        return this;

    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] multiplyPolyCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j <right.coeffs.length; j++) {
                multiplyPolyCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomial multiPoly = new MyPolynomial(multiplyPolyCoeffs);
        return multiPoly;
    }

}