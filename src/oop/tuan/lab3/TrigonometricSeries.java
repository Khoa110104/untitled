package oop.tuan.lab3;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numTerms: ");
        int numTerms = in.nextInt();
        System.out.println("Sin: (Using formula ) - (Using JDK methods)");
        System.out.println(sin(0, numTerms) + " - " + Math.sin(0));
        System.out.println(sin(Math.PI / 6, numTerms) + " - " + Math.sin(Math.PI / 6));
        System.out.println(sin(Math.PI / 4, numTerms) + " - " + Math.sin(Math.PI / 4));
        System.out.println(sin(Math.PI / 3, numTerms) + " - " + Math.sin(Math.PI / 3));
        System.out.println(sin(Math.PI / 2, numTerms) + " - " + Math.sin(Math.PI / 2));
        System.out.println();
        System.out.println("Cos: (Using formula ) - (Using JDK methods)");
        System.out.println(cos(0, numTerms) + " - " + Math.cos(0));
        System.out.println(cos(Math.PI / 6, numTerms) + " - " + Math.cos(Math.PI / 6));
        System.out.println(cos(Math.PI / 4, numTerms) + " - " + Math.cos(Math.PI / 4));
        System.out.println(cos(Math.PI / 3, numTerms) + " - " + Math.cos(Math.PI / 3));
        System.out.println(cos(Math.PI / 2, numTerms) + " - " + Math.cos(Math.PI / 2));

    }

    public static double sin(double x, int numTerms) {
        double fraction = x;
        double sin = x;
        for (int i = 3; i <= numTerms; i += 2) {
            fraction = fraction - x * x / i / (i - 1);
            sin += fraction;
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double fraction = 1;
        double cos = 1;
        for (int i = 2; i <= numTerms; i += 2) {
            fraction = fraction - x * x / i / (i - 1);
            cos += fraction;
        }
        return cos;
    }

}
