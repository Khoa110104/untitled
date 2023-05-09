package oop.lab.lab4;

public class ExercisesOnRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(8));
        System.out.println(runningNumberSequence(12));
        System.out.println(gcd(-10, 3));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        return (n == 0 || n == 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int runningNumberSequence(int n) {
        if (n == 1) {
            return 1;
        }
        return runningNumberSequence(n - 1) + getNumOfDigits(n);
    }

    public static int getNumOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, remainder(a, b));
    }

    public static int remainder(int a, int b) {
        return Math.abs(a % b);
    }
}
