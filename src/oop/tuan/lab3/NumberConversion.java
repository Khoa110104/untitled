package oop.tuan.lab3;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = sc.next();
        System.out.print("Enter the input radix : ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.print("\"" + in + "\"" + " in radix " + inRadix + " is \"" +
                toRadix(in, inRadix, outRadix) + "\" " + "in radix " + outRadix + ".");
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDec(in, inRadix);
        }
        if (inRadix == 10) {
            return decTo(in, outRadix);
        }
        String dec = toDec(in, inRadix);
        return decTo(dec, outRadix);
    }

    public static String toDec(String in, int inRadix) {
        in = in.toUpperCase();
        int dec = 0;
        for (int i = 0; i < in.length(); i++) {
            char myChar = in.charAt(i);
            if (myChar >= '0' && myChar <= '9') {
                int digit = myChar - '0';
                dec = dec * inRadix + digit;
            } else if (myChar >= 'A' && myChar <= 'F') {
                int digit = myChar - 'A' + 10;
                dec = dec * inRadix + digit;
            }
        }
        return dec + "";
    }

    public static String decTo(String in, int outRadix) {
        int dec = Integer.parseInt(in);
        String result = "";
        while (dec > 0) {
            int tmp = dec % outRadix;
            if (tmp < 10) {
                result =  tmp + result;
            } else {
                result = (char) (tmp + 55) + result;
            }
            dec /= outRadix;
        }
        return result;
    }
}
