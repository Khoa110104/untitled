package oop.lab.lab5.ex1_7;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        //Test constructor and toString()
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = in.nextDouble();
        double imag1 = in.nextDouble();
        MyComplex myComplex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = in.nextDouble();
        double imag2 = in.nextDouble();
        MyComplex myComplex2 = new MyComplex(real2, imag2);
        System.out.println("Number 1 is : (" + myComplex1 + ")");

        //Test isReal()
        if (myComplex1.isReal()) {
            System.out.println("(" + myComplex1 + ") is a pure real number");
        } else {
            System.out.println("(" + myComplex1 + ") is NOT a pure real number");
        }

        //Test isImaginary()
        if (myComplex1.isImaginary()) {
            System.out.println("(" + myComplex1 + ") is a pure imaginary number");
        } else {
            System.out.println("(" + myComplex1 + ") is NOT a pure imaginary number");
        }
        System.out.println();

        System.out.println("Number 2 is (" + myComplex2 + ")");
        if (myComplex2.isReal()) {
            System.out.println("(" + myComplex2 + ") is a pure real number");
        } else {
            System.out.println("(" + myComplex2 + ") is NOT a pure real number");
        }

        if (myComplex2.isImaginary()) {
            System.out.println("(" + myComplex2 + ") is a pure imaginary number");
        } else {
            System.out.println("(" + myComplex2 + ") is NOT a pure imaginary number");
        }
        System.out.println();

        //Test equals()
        if (myComplex1.equals(myComplex2)) {
            System.out.println("(" + myComplex1 + ") is equal to (" + myComplex2 + ")");
        } else {
            System.out.println("(" + myComplex1 + ") is NOT equal to (" + myComplex2 + ")");
        }

        //Test addNew()
        System.out.println("(" + myComplex1 + ") + " +
                "(" + myComplex2 + ") = (" +
                myComplex1.addNew(myComplex2) + ")");

        //Test magnitude
        System.out.println("The magnitude of the complex number 1 is: " + myComplex1.magnitude());

        //Test argument()
        System.out.println("The argument of the complex number 1 is: " + myComplex1.argument());

        //Test subtractNew()
        System.out.println("(" + myComplex1 + ") - " +
                "(" + myComplex2 + ") = (" +
                myComplex1.subtractNew(myComplex2) + ")");

        //Test multiply()
        System.out.print("(" + myComplex1 + ")");
        System.out.println(" * " +
                "(" + myComplex2 + ") = (" +
                myComplex1.multiply(myComplex2) + ")");

        //Test divide()
        System.out.print("(" + myComplex1 + ")");
        System.out.println(" / " +
                "(" + myComplex2 + ") = (" +
                myComplex1.divide(myComplex2) + ")");

        //Test conjugate()
        System.out.println("Conjugate number of the complex number 2 is: "
                + myComplex2.conjugate());

        //Test add()
        System.out.print("(" + myComplex1 + ")");
        System.out.println(" + " +
                "(" + myComplex2 + ") = (" +
                myComplex1.add(myComplex2) + ")");

        //Test subtract()
        System.out.print("(" + myComplex1 + ")");
        System.out.println(" - " +
                "(" + myComplex2 + ") = (" +
                myComplex1.subtract(myComplex2) + ")");
    }

}
