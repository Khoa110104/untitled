package oop.tuan.lab3;

import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number x: ");
        int x = in.nextInt();
        if (x < -1 || x > 1) {
            System.out.print("Invalid input...!!!");
            return;
        }
        System.out.print("Enter the numTerms: ");
        int numTerms = in.nextInt();
        System.out.println("Result of the series: " + specialSeries(x, numTerms));

    }

    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double fraction = x;
        for (int i = 1; i <= numTerms; i++) {
            fraction = fraction * (2 * i - 1) / (2 * i) * (2 * i - 1) / (2 * i + 1) * x * x;
            result += fraction;
        }

        return result;
    }
}
