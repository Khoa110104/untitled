package oop.lab.lab1;

public class CheckOddEven {
    public static void main(String[] args) {
        checkOddEven(3);
        checkOddEven(2);
    }

    public static void checkOddEven(int number) {
        System.out.println("The number is " + number);
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE!");
    }
}
