package oop.lab.homework1;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string you want to check: ");
        String str = in.nextLine();
        printTheResult(str);
    }

    public static boolean testPalindromicWord(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < str.length() - 1 && (str.charAt(left) < 'A' || str.charAt(right) > 'Z')) {
                left++;
            }
            while (right > 0 && (str.charAt(right) < 'A' || str.charAt(right) > 'Z')) {
                right--;
            }
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
//    public static boolean checkPalindromic(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i -1)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void printTheResult(String str) {
        if (testPalindromicWord(str)) {
            System.out.printf("\"%s\" is a palindrome", str);
        } else {
            System.out.printf("\"%s\" is not a palindrome", str);
        }
    }
}
