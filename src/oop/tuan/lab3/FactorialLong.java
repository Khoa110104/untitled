package oop.tuan.lab3;

public class FactorialLong {
    public static void main(String[] args) {
        printFactorial();
    }

    public static void printFactorial() {
        long factorial = 1;
        long n = 1;
        while (factorial <= Long.MAX_VALUE / n) {
            factorial *= n;
            System.out.println("The factorial of " + n + " is " + factorial);
            n++;
        }
        System.out.println("The factorial of " + n + " is out of range");
    }
}