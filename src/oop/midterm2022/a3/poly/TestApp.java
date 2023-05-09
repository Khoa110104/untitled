package oop.midterm2022.a3.poly;

import java.util.Random;

/**
 * Develop two classes, namely ArrayPolynomial and ListPolynomial, for managing polynomials.
 * More specifically, the two classes must exhibit the same functionalities
 * (they both implement the IPolynomial Interface) but using different mechanisms
 * internally.
 * <p>
 * Given a generic polynomial, c0 + c_1 * x + c_2 * x^2 + ... + c_n * x^n
 * <p>
 * ArrayPolynomial stores a polynomial using double[] (c0..c_n).
 * <p>
 * ListPolynomial, stores a polynomial using List<Double> (c0..c_n).
 * <p>
 * Both classes must work with the main method provided below.
 */
/**
 * Develop two classes, namely ArrayPolynomial and ListPolynomial, for managing polynomials.
 * More specifically, the two classes must exhibit the same functionalities
 * (they both implement the IPolynomial Interface) but using different mechanisms
 * internally.
 * <p>
 * Given a generic polynomial, c0 + c_1 * x + c_2 * x^2 + ... + c_n * x^n
 * <p>
 * ArrayPolynomial stores a polynomial using double[] (c0..c_n).
 * <p>
 * ListPolynomial, stores a polynomial using List<Double> (c0..c_n).
 * <p>
 * Both classes must work with the main method provided below.
 */
public class TestApp {

    private static double[] randomDoubleArray() {
        Random random = new Random();
        int n = random.nextInt(10);
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            double value = random.nextDouble();
            data[i] = Math.round(value * 10) / 10.0;
        }
        return data;
    }

    public static void main(String[] args) {
        // Tạo 2 đa thức dùng cấu trúc mảng, đặt tên là ap1, ap2. Các hệ số của đa thức được sinh ngẫu nhiên.
        // Tạo 2 đa thức dùng cấu trúc list, đặt tên là lp1, lp2. Các hệ số của đa thức được sinh ngẫu nhiên.
        // Thực hiện các phép cộng các đa thức, trừ các đa thức, nhân các đa thức.
        // Thực hiện các phép lấy đạo hàm, tích phân, tính giá trị của đa thức tại x đã cho.
        // Kết quả chạy chương trình lưu vào file Poly<Mã sinh viên>.txt.

//        double[] poly1 = randomDoubleArray();
//        double[] poly2 = randomDoubleArray();
        double[] poly1 ={1,2,3,-3};
        double[] poly2={2,3,4,-1};
        IPolynomial ap1 = new ArrayPolynomial(poly1);
        IPolynomial ap2 = new ArrayPolynomial(poly2);

        IPolynomial lp1 = new ListPolynomial(poly1);
        IPolynomial lp2 = new ListPolynomial(poly2);

        // in đa thức
        System.out.println("============Print Polynomial============");
        System.out.println("AP1: " + ap1);
        System.out.println("AP2: " + ap2 + "\n");

        System.out.println("LP1: " + lp1);
        System.out.println("LP2: " + lp2 + "\n");

        //noinspection CastCanBeRemovedNarrowingVariableType
        ArrayPolynomial myAp1 = (ArrayPolynomial) ap1;
        //noinspection CastCanBeRemovedNarrowingVariableType
        ArrayPolynomial myAp2 = (ArrayPolynomial) ap2;
        //noinspection CastCanBeRemovedNarrowingVariableType
        ListPolynomial myLp1 = (ListPolynomial) lp1;
        //noinspection CastCanBeRemovedNarrowingVariableType
        ListPolynomial myLp2 = (ListPolynomial) lp2;

        // cộng đa thức
        System.out.println("============Plus Polynomial============");
        System.out.println("AP1 + AP2: " + myAp1.plus(myAp2));
        System.out.println("LP1 + LP2: " + myLp1.plus(myLp2) + "\n");

        // trừ đa thức
        System.out.println("============Minus Polynomial============");
        System.out.println("AP1 - AP2: " + myAp1.minus(myAp2));
        System.out.println("LP1 - LP2: " + myLp1.minus(myLp2) + "\n");

        // nhân đa thức
        System.out.println("============Times Polynomial============");
        System.out.println("AP1 * AP2: " + myAp1.times(myAp2));
        System.out.println("LP1 * LP2: " + myLp1.times(myLp2) + "\n");

        // đạo hàm
        System.out.println("============Derivative============");
        System.out.println("AP1 derivative: " + ap1.derivative());
        System.out.println("AP2 derivative: " + ap2.derivative());
        System.out.println("LP1 derivative: " + lp1.derivative());
        System.out.println("LP2 derivative: " + lp2.derivative() + "\n");

        // tích phân
        System.out.println("============Integral============");
        System.out.println("AP1 integral: " + ap1.integral());
        System.out.println("AP2 integral: " + ap2.integral());
        System.out.println("LP1 integral: " + lp1.integral());
        System.out.println("LP2 integral: " + lp2.integral() + "\n");

        // tích giá trị tại x đã cho (x = 2.8)
        System.out.println("============Evaluate============");
        System.out.println("AP1 evaluate: " + ap1.evaluate(2.8));
        System.out.println("AP2 evaluate: " + ap2.evaluate(2.8));
        System.out.println("LP1 evaluate: " + lp1.evaluate(2.8));
        System.out.println("LP2 evaluate: " + lp2.evaluate(2.8) + "\n");
    }
}

