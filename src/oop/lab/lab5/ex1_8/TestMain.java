package oop.lab.lab5.ex1_8;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        int x = 4;
        double[] coeffs = {1.1, 2.2, 3.3};
        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs);
        MyPolynomial myPolynomial2 = new MyPolynomial(1.1, -2.2, 3.3, 4.4, 5.5);
        System.out.println(myPolynomial1);
        System.out.println(myPolynomial2);

        //BasicStatistics evaluate()
        System.out.println(myPolynomial1.evaluate(x));

        //BasicStatistics add()
        System.out.println(myPolynomial1.add(myPolynomial2));

        //BasicStatistics multiply
        System.out.println(myPolynomial1.multiply(myPolynomial2));
    }
}
