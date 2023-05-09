package oop.lab.homework1;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        System.out.print("Enter th string: ");
        in.nextLine();
        String str = in.nextLine();
        System.out.printf("The equivalent decimal number \"%s\" is: %d",
                str, radixN2Dec(str.toUpperCase(), radix));
    }

    public static long radixN2Dec(String str, int radix) {
        long dec = 0;
        long radixPow = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                dec += (c - '0') * radixPow;
            } else {
                dec += (c - 'A' + 10) * radixPow;
            }
            radixPow *= radix;
        }
        return dec;
    }


}
