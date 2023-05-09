package oop.lab.homework1;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String testString = in.nextLine();
        int numberOfVowels = countVowels(testString);
        int numberOfDigits = countDigits(testString);
//        System.out.println("Number of vowels: " + numberOfVowels);
//        System.out.println("Number of digits: " + numberOfDigits);
        double percentageOfDigits = getPercentageOfDigits(testString);
        double percentageOfVowels = getPercentageOfVowels(testString);
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numberOfVowels, percentageOfVowels);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numberOfDigits, percentageOfDigits);

    }

    public static boolean isVowelsUsingArray(char lowerChar) {
        char[] vowels = {'u', 'e', 'o', 'a', 'i'};
        for (char vowel : vowels) {
            if (lowerChar == vowel) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowelsUsingString(char lowerChar) {
        final String VOWEL_STRING = "ueoai";
        int id = VOWEL_STRING.indexOf(lowerChar);
        return (id == -1) ? false : true;
    }

    public static int countVowels(String myString) {
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (isVowelsUsingString(myString.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String myString) {
        String lowerString = myString.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerString.length(); i++) {
            if (lowerString.charAt(i) >= '0' && lowerString.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }

    public static double getPercentageOfDigits(String myString) {
        int numberOfDigits = countDigits(myString);
        double percentage = 100.0 * numberOfDigits / myString.length();
        return percentage;
    }

    public static double getPercentageOfVowels(String myString) {
        int numberOfVowels = countVowels(myString);
        double percentage = 100.0 * numberOfVowels / myString.length();
        return percentage;
    }

    public static double roundNumber(double number, int decimal) {
        return Math.round(number * Math.pow(10, decimal)) / Math.pow(10, decimal);
    }
}
