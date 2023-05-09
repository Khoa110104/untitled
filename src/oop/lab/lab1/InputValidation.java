package oop.lab.lab1;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        inputValidation(in);
    }

    public static void inputValidation(Scanner in) {
        boolean isValid;
        isValid = false;
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            int numberIn = in.nextInt();
            if (numberIn >= 0 && numberIn <= 10 || numberIn >= 90 && numberIn <= 100) {
                isValid = true;
                System.out.println("You have entered: " + numberIn);
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
        while (!isValid);
    }
}
