package oop.final3.fraction;

public class Fraction extends Number implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction) {
        this(fraction.numerator, fraction.denominator);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public Fraction add(Fraction fraction) {
        int newDenominator = denominator / gcd(denominator, fraction.denominator) * fraction.denominator;
        int newNumerator = newDenominator / denominator * numerator + newDenominator / fraction.denominator * fraction.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(int a) {
        return add(new Fraction(a));
    }

    public int compareTo(Fraction fraction) {
        int newDenominator = denominator / gcd(denominator, fraction.denominator) * fraction.denominator;
        return Integer.compare(newDenominator / denominator * numerator, newDenominator / fraction.denominator * fraction.numerator);
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public boolean equals(Fraction fraction) {
        return compareTo(fraction) == 0;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    private int gcd(int x, int y) {
        while (y > 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / (long) denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("The denominator cannot be 0");
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    private void simplify() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public String toString() {
        return "Fraction[" + numerator + "/" + denominator + "]";
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(9, 4);
        Fraction fraction3 = new Fraction(fraction2);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.add(4));
        System.out.println(fraction3.doubleValue());
        System.out.println(fraction3.floatValue());
        System.out.println(fraction3.intValue());
        System.out.println(fraction3.longValue());

        Fraction fraction4 = new Fraction(3, 4);
        System.out.println(fraction4);
        fraction4.setDenominator(12);
        System.out.println("denominator: " + fraction4.getDenominator());
        System.out.println("numerator: " + fraction4.getNumerator());
        System.out.println(fraction4);
        fraction4.setNumerator(4);
        System.out.println(fraction4);

        System.out.println(fraction1.equals(fraction2));
        System.out.println(fraction1.compareTo(fraction3));
    }

}