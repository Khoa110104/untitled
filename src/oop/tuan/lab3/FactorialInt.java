package oop.tuan.lab3;

public class FactorialInt {
    public static void main(String[] args) {
        printFactorial();
    }

    public static void printFactorial() {
        int factorial = 1;
        int n = 1;
        while (factorial <= Integer.MAX_VALUE / n) {
            factorial *= n;
            System.out.println("The factorial of " + n + " is " + factorial);
            n++;
        }
        System.out.println("The factorial of " + n + " is out of range");
    }
}