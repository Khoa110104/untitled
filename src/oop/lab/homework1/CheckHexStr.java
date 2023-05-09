package oop.lab.homework1;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String str = in.nextLine();
        printTheResult(str.toUpperCase());
    }

    public static boolean checkHexStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static void printTheResult(String str) {
        if (checkHexStr(str)) {
            System.out.printf("\"%s\" is a hex string", str);
        } else {
            System.out.printf("\"%s\" is NOT a hex string", str);
        }
    }
}
