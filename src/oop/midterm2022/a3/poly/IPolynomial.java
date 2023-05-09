package oop.midterm2022.a3.poly;

public interface IPolynomial {
    double coefficient(int degree);

    int degree();

    double[] coefficients();

    IPolynomial derivative();

    double evaluate(double x);

    IPolynomial integral();
}
