package oop.lab.homework1;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String hexString = in.nextLine();
        System.out.println("The equivalent decimal number for hexadecimal " + "'" + hexString + "'" + " is " + hex2DecUsingTerm(hexString));
    }

    public static int valueInHex(char hexChar) {
        final String HEX_STRING = "0123456789abcdef";
        return HEX_STRING.indexOf(hexChar);
    }

    public static boolean isHexString(String myString) {
        if (myString == null || myString.equals("")) {
            return false;
        }
        for (int i = 0; i < myString.length(); i++) {
            if (valueInHex(myString.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int hex2DecUsingTerm(String hexString) {
        if (!isHexString(hexString)) {
            return -1;
        }
        int sum = 0;
        int term = 1;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            sum += valueInHex(hexString.charAt(i)) * term;
            term *= 16;
        }
        return sum;
    }
}
