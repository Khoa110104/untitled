package oop.lab.homework1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String str = in.nextLine();
        final int N = 3;
        System.out.print("The plaintext string is: ");
        printDecipherCaesarCode(str.toUpperCase(), N);
    }

    public static void printDecipherCaesarCode(String str, int n) {
        for (int i = 0; i < str.length(); i++) {
            char code = str.charAt(i);
            code -= n;
            if (code < 'A') {
                code += 26;
            }
            System.out.print(code);
        }
    }
}
