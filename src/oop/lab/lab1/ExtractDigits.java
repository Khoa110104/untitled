package oop.lab.lab1;

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits(100);
    }

    public static void extractDigits(int number) {
        int initialNum = number;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
