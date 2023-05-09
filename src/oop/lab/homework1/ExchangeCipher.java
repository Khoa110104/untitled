package oop.lab.homework1;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = in.nextLine();
        System.out.print("The ciphertext string is: ");
        printExchangeCipher(str.toUpperCase());
    }

    public static void printExchangeCipher(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) ('A' + 'Z' - str.charAt(i)));
        }
    }
}
