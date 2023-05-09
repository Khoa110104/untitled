package oop.lab.lab1;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = in.nextInt();
        System.out.print("Enter 4th integer: ");
        int number4 = in.nextInt();
        System.out.print("Enter 5th integer: ");
        int number5 = in.nextInt();
        sumProductMinMax3(number1, number2, number3, number4, number5);
    }

    public static void sumProductMinMax3(int number1, int number2,
                                         int number3, int number4, int number5) {
        int sum = 0;
        int product = 0;
        int min = 0;
        int max = 0;
        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
