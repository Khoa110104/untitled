package oop.final3.poly;

public abstract class AbstractPoly implements Poly {
    protected int degree;

    public AbstractPoly() {
    }

    public int degree() {
        return degree;
    }

    int[] differentiate() {
        if (degree == 0) {
            return new int[]{0};
        }
        int[] diff = new int[degree];
        for (int i = 0; i < degree; i++) {
            diff[i] = coefficient(i + 1) * (i + 1);
        }
        return diff;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AbstractPoly abstractPoly)) {
            return false;
        }
        if (abstractPoly.degree != degree) {
            return false;
        }
        for (int i = 0; i <= degree; i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    public double evaluate(double x) {
        double f = 0;
        double powX = 1;
        for (int i = 0; i <= degree; i++) {
            f = f + coefficient(i) * powX;
            powX *= x;
        }
        return f;
    }

    @Override
    public String toString() {
        String s = "Poly[";
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
    }
}
