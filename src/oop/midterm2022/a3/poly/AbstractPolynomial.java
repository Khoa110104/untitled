package oop.midterm2022.a3.poly;

public abstract class AbstractPolynomial implements IPolynomial {
    protected int degree;

    public AbstractPolynomial() {

    }

    // trả về bậc
    @Override
    public int degree() {
        /* TODO */
        return degree;
    }

    // trả về MẢNG các hệ số của đạo hàm
    public double[] differentiate() {
        /* TODO */
        if (degree == 0) {
            return new double[]{0};
        }
        double[] diff = new double[degree];
        for (int i = 0; i < degree; i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    // hệ số nguyên hàm bậc 3 = (hệ số gốc bậc 2) / 3
    // hệ số nguyên hàm bậc 4 = (hệ số gốc bậc 3) / 4

    // Hằng số trong phép tính tích phân mặc định là 1
    public double[] integrate() {
        /* TODO */
        double[] result = new double[degree + 2];
        result[0] = 1;
        for (int i = 0; i <= degree; i++) {
            result[i + 1] = coefficient(i) / (i + 1);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        /* TODO */
        if (!(o instanceof IPolynomial)) {
            return false;
        }
        //noinspection PatternVariableCanBeUsed
        IPolynomial iPolynomial = (IPolynomial) o;
        if (iPolynomial.degree() != degree) {
            return false;
        }
        for (int i = 0; i < coefficients().length; i++) {
            if (iPolynomial.coefficient(i) != coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        /* TODO */
        String s = "IPolynomial[";
        for (int i = 0; i <= degree; i++) {
            if (coefficient(i) != 0) {
                if (i == 0) {
                    s += coefficient(i);
                } else {
                    if (s.charAt(s.length() - 1) != '[') {
                        if (coefficient(i) > 0) {
                            s += " + ";
                        } else {
                            s += " - ";
                        }
                    }
                    s += Math.abs(coefficient(i));
                    if (i == 1) {
                        s += "x";
                    } else {
                        s += "x^" + i;
                    }
                }
            }
        }
        s += "]";
        return s;
//        return "IPolynomial[coefficients=" + Arrays.toString(coefficients()) + "]";
    }

    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        double multiX = 1;
        for (double i : coefficients()) {
            result += multiX * i;
            multiX *= x;
        }
        return result;
    }
}
