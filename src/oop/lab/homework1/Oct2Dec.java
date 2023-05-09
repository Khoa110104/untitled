package oop.lab.homework1;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octString = in.nextLine();
        if (!isOctal(octString)) {
            System.out.printf("error: invalid octal string \"%s\" ", octString);
        } else {
            System.out.printf("The equivalent decimal number for binary \"%s\" is : %d "
                    , octString, octToDec(octString));
        }
    }

    public static boolean isOctal(String octString) {
        for (int i = 0; i < octString.length(); i++) {
            char c = octString.charAt(i);
            if (c < '0' || c > '7') {
                return false;
            }
        }
        return true;
    }

    public static int octToDec(String octString) {
        int dec = 0;
        for (int i = 0; i < octString.length(); i++) {
            int digit = octString.charAt(i) - '0';
            int power = octString.length() - i - 1;
            dec += digit * Math.pow(8, power);

        }
        return dec;
    }
}
