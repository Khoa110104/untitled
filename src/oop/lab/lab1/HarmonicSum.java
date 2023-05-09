package oop.lab.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        harmonicSum();
    }

    public static void harmonicSum() {
        final int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int i = 1; i <= maxDenominator; i++) {
            sumL2R += 1 / i;
        }
        for (int i = maxDenominator; i >= 1; i--) {
            sumR2L += 1 / i;
        }
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The sum from left - to - right is: " + sumL2R);
        System.out.println("The sum from right - to - left is: " + sumR2L);
        System.out.println("absDiff is: " + absDiff);
    }
}
