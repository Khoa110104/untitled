package oop.lab.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        averageWithInputValidation(in);
    }

    public static void averageWithInputValidation(Scanner in) {
        final int NUM_STUDENT = 3;
        boolean isValid;
        int sum = 0;
        double average;
        for (int studentNo = 1; studentNo <= NUM_STUDENT; ++studentNo) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                int numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                    sum += numberIn;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
            while (!isValid);
        }
        average = (double) sum / NUM_STUDENT;
        System.out.printf("The average is: %.2f", average);
    }
}
