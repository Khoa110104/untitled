package oop.tuan.lab5.ex1_8;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i <= getDegree(); i++) {
            if (coeffs[coeffs.length - i - 1] != 0) {
                if (i == 0) {
                    str += coeffs[coeffs.length - i - 1];
                } else {
                    if (str.charAt(str.length() - 1) != '[') {
                        if (coeffs[coeffs.length - i - 1] > 0) {
                            str += " + ";
                        } else {
                            str += " - ";
                        }
                    }
                    str += Math.abs(coeffs[coeffs.length - i - 1]);
                    if (i == 1) {
                        str += "x";
                    } else {
                        str += "x^" + i;
                    }
                }
            }
        }
        return str;
    }

    public double evaluate(double x) {
        double multiX = 1;
        double result = 0;
        for (double i : coeffs) {
            result += multiX * i;
            multiX = multiX * x;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (getDegree() < right.getDegree()) {
            coeffs = Arrays.copyOf(coeffs, right.getDegree() + 1);
        }
        for (int i = 0; i < right.getDegree(); i++) {
            coeffs[i] += right.coeffs[i];
        }
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] result = new double[getDegree() + right.getDegree() + 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.getDegree(); j++) {
                result[i + j] = coeffs[i] * right.coeffs[j];
            }
        }
        coeffs = result;
        return this;
    }
}
