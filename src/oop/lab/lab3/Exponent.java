package oop.lab.lab3;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        in.close();
        System.out.println(base + " raises to the power of " + exp
                + " is: " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
}
