package oop.lab.lab3;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = in.nextLine();
        String s = hexString.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char hexChar = s.charAt(i);
            if (!(hexChar <= '9' && hexChar >= '0') && !(hexChar >= 'A' && hexChar <= 'F')) {
                System.out.println("Input is not valid");
                return;
            }
        }
        in.close();
        System.out.print("The equivalent binary for hexadecimal \"" + hexString + "\" is: ");
        printHex2Bin(s, HEX_BITS);
    }

    public static void printHex2Bin(String s, String[] HEX_BITS) {
        for (int i = 0; i < s.length(); i++) {
            char hexChar = s.charAt(i);
            if (hexChar <= '9' && hexChar >= '0') {
                System.out.print(HEX_BITS[hexChar - '0'] + " ");
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                System.out.print(HEX_BITS[(char) (hexChar - 'A' + 10)] + " ");
            }
        }
    }
}