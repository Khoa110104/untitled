package oop.tuan.lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printDec2Hex(in);
    }

    public static char toHex(int hexValue) {
        if (hexValue >= 0 && hexValue <= 9) {
            return (char) (hexValue + '0');
        } else {
            return (char) (hexValue - 10 + 'A');
        }
    }

    public static void printDec2Hex(Scanner in) {
        String hex = "";
        boolean isValid = false;
        System.out.print("Enter a decimal number: ");
        if (in.hasNextInt()) {
            int dec = in.nextInt();
            if (dec > 0) {
                isValid = true;
                while (dec > 0) {
                    int hexValue = dec % 16;
                    hex = toHex(hexValue) + hex;
                    dec /= 16;
                }
                System.out.println("The equivalent hexadecimal number is " + hex);
            }
        }
        in.nextLine();
        if (!isValid) {
            System.out.println("Invalid Input...!!");
        }
        in.close();
    }
}
