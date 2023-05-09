package oop.lab.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci();
    }

    public static void printFibonacci() {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum += fn;
            n++;
        }
        System.out.println();
        System.out.println("The average is: " + sum / (double) nMax);
    }
}
