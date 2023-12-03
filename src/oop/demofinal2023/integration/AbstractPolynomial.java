package oop.demofinal2023.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     *
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        String poly = "[";
        for (int index = 0; index <= degree(); index++) {
            if (coefficient(index) != 0) {
                if (index == 0) {
                    poly += coefficient(index);
                } else {
                    if (poly.charAt(poly.length() - 1) != '[') {
                        if (coefficient(index) > 0) {
                            poly += " + ";
                        } else {
                            poly += " - ";
                        }
                    }
                    poly += Math.abs(coefficient(index));
                    if (index == 1) {
                        poly += "x";
                    } else {
                        poly += "x^" + index;
                    }
                }
            }
        }
        poly += "]";
        return poly;

    }

    /**
     * Lấy đạo hàm đa thức.
     *
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] differentiate = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            differentiate[i] = coefficient(i + 1) * (i + 1);
        }
        return differentiate;
    }
}
