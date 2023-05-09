package oop.tuan.homework1.ex2_2;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void countVowelsDigits(String input) {
        String vowels = "ueoai";
        int vowelsCount = 0, digitCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) > -1) {
                vowelsCount++;

            } else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                digitCount++;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelsCount, (double) vowelsCount / input.length() * 100);
        System.out.printf("Number of digit: %d (%.2f%%)\n", digitCount, (double) digitCount / input.length() * 100);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        countVowelsDigits(in.next().toLowerCase());
        in.close();
    }
}
