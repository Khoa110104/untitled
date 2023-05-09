package oop.lab.lab9.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    public double[] derive() {
        if (this.degree() == 0) {
            return new double[]{0};
        }
        double[] deriveCoefficients = new double[this.degree()];
        for (int i = 0; i < deriveCoefficients.length; i++) {
            deriveCoefficients[i] = this.coefficient(i + 1) * (i + 1);
        }
        return deriveCoefficients;
    }

    public boolean equals(Object poly2) {
        if (poly2 instanceof Poly) {
            if (((Poly) poly2).degree() != this.degree()) {
                return false;
            }
            for (int i = 0; i <= this.degree(); i++) {
                if (this.coefficient(i) != ((Poly) poly2).coefficient(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.coefficients());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.coefficient(0));
        for (int i = 1; i <= this.degree(); i++) {
            if (this.coefficient(i) != 0) {
                stringBuilder.append(String.format(" + %.2fx^%d", this.coefficient(i), i));
            }
        }
        return stringBuilder.toString();
    }
}

