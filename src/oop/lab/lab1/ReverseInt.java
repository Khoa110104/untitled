package oop.lab.lab1;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int inNumber = in.nextInt();
        reverseInt(inNumber);
    }

    public static void reverseInt(int inNumber) {
        int inDigit;
        int reverse = 0;
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            reverse = reverse * 10 + inDigit;
            inNumber /= 10;
        }
        System.out.println("The reverse is: " + reverse);
    }
}
