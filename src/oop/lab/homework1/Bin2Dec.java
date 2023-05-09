package oop.lab.homework1;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String binString = in.nextLine();
        if (!isBinary(binString)) {
            System.out.printf("error: invalid binary string \"%s\" ", binString);
        } else {
            System.out.printf("The equivalent decimal number for binary \"%s\" is : %d "
                    , binString, binToDec(binString));
        }
    }

    public static int binToDec(String binString) {
        int dec = 0;
        for (int i = 0; i < binString.length(); i++) {
            int digit = binString.charAt(i) - '0';
            int power = binString.length() - i - 1;
            dec += digit * Math.pow(2, power);
        }
        return dec;
    }

    public static boolean isBinary(String binString) {
        for (int i = 0; i < binString.length(); i++) {
            char c = binString.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
