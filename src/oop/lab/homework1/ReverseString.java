package oop.lab.homework1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        printReverseString(str);
    }

    public static void printReverseString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        System.out.printf("The reverse of String \"%s\" is \"%s\".", str, reverseString);
    }
}
