package oop.lab.lab1;

public class ComputePI {
    public static void main(String[] args) {
        double piDenominator = usingDenominator(1000);
        double piTerm = usingTerm(1000);
        System.out.println(compareValue(piDenominator));
        System.out.println(compareValue(piTerm));

    }

    public static double usingDenominator(int maxDenominator) {
        double pi;
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        return pi = 4 * sum;
    }

    public static double usingTerm(int maxTerm) {
        double pi;
        double sum = 0.0;
        for (int i = 1; i <= maxTerm; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / (i * 2 - 1);
            } else {
                sum -= 1.0 / (i * 2 - 1);
            }
        }
        return pi = 4 * sum;
    }

    public static double compareValue(double result) {
        return (result / Math.PI) * 100;
    }
}
