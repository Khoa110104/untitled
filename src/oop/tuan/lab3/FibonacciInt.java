package oop.tuan.lab3;

public class FibonacciInt {
    public static void main(String[] args) {
        printFibonacci();
    }

    public static void printFibonacci() {
        int fibonacci1 = 1;
        System.out.println("F(0) = " + fibonacci1);
        int fibonacci2 = 1;
        System.out.println("F(1) = " + fibonacci2);
        int count = 2;
        while (Integer.MAX_VALUE - fibonacci2 >= fibonacci1) {
            fibonacci2 += fibonacci1;
            fibonacci1 = fibonacci2 - fibonacci1;
            System.out.println("F(" + count + ") = " + fibonacci2);
            count++;
        }
        System.out.println("F(" + count + ") is out of the range of int");

    }
}