package oop.lab.lab5.ex1_8;

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
        StringBuilder poly = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            poly.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append("+");
        }
        poly.delete(poly.length() - 3, poly.length());
        return poly.toString();
    }

    public double evaluate(double x) {
        double polyVal = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyVal = polyVal * x + coeffs[i];
        }
        return polyVal;
    }

    public MyPolynomial add(MyPolynomial right) {
        int minDegree = Math.min(this.getDegree(), right.getDegree());
        int maxDegree = Math.max(this.getDegree(), right.getDegree());

        double[] addPolyCoeffs = new double[maxDegree];
        for (int i = 0; i < maxDegree; i++) {
            addPolyCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree()) {
            for (int i = minDegree; i < maxDegree; i++) {
                addPolyCoeffs[i] = this.coeffs[i];
            }
        } else {
            for (int i = minDegree; i < maxDegree; i++) {
                addPolyCoeffs[i] = right.coeffs[i];
            }
        }
        MyPolynomial addPoly = new MyPolynomial(addPolyCoeffs);
        return addPoly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] multiplyPolyCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiplyPolyCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomial multiPoly = new MyPolynomial(multiplyPolyCoeffs);
        return multiPoly;
    }

}