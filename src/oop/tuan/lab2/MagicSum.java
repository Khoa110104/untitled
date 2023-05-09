package oop.tuan.lab2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printMagicSum(in);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            int tmp = number % 10;
            if (tmp == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void printMagicSum(Scanner in) {
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (number != SENTINEL) {
                if (hasEight(number)) {
                    sum += number;
                }
            } else {
                System.out.println("The magic sum is: " + sum);
                break;
            }
        }
    }
}
