package oop.homework.homework3.ex1;


public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    public Fraction add(Fraction c) {
        if (this.denominator == c.denominator) {
            float newNumerator = this.numerator + c.numerator;
            return new Fraction(newNumerator, this.denominator);
        }
        float newNumerator = this.numerator * c.denominator + this.denominator * c.numerator;
        float newDenominator = this.denominator * c.denominator;
        return new Fraction(newNumerator, newDenominator);

    }

    public Fraction minus(Fraction c) {
        if (this.denominator == c.denominator) {
            float newNumerator = this.numerator - c.numerator;
            return new Fraction(newNumerator, this.denominator);
        }
        float newNumerator = this.numerator * c.denominator - this.denominator * c.numerator;
        float newDenominator = this.denominator * c.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multi(Fraction c) {
        float newNumerator = this.numerator * c.numerator;
        float newDenominator = this.denominator * c.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divi(Fraction c) {
        Fraction newFraction = new Fraction(c.denominator, c.numerator);
        return multi(newFraction);
    }

    private static float gcd(float a, float b) {
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public  void normalize() {
        float greatestCommonDivisor = gcd(this.numerator, this.denominator);
        numerator = numerator / greatestCommonDivisor;
        denominator = denominator / greatestCommonDivisor;

    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        if (numerator < 0 && denominator <0) {
            return Math.abs(numerator) + "/" + Math.abs(denominator);
        } else if (numerator > 0 && denominator< 0) {
            return "-" + numerator + "/" + Math.abs(denominator);
        } else if (denominator == 1) {
            return Float.toString(numerator);
        } else if (numerator == 0) {
            return "0";
        } else {
            return numerator + "/" + denominator;
        }
    }

}
