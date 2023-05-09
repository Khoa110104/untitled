package oop.lab.homework1;


import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        final char MYCHAR = '#';
        System.out.println("Using for:");
        printSquarePatternUsingForLoop(size, MYCHAR);
        System.out.println();
        System.out.println("Using while-do:");
        printSquarePatternUsingWhileDoLoop(size, MYCHAR);
    }

    public static void printSquarePatternUsingForLoop(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == size - 1) {
                    System.out.print(myChar);
                } else {
                    System.out.print(myChar + " ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printSquarePatternUsingWhileDoLoop(int size, char myChar) {
        int row = 0;
        while (row < size) {
            int col = 0;
            while (col < size) {
                if (col == size - 1) {
                    System.out.print(myChar);
                } else {
                    System.out.print(myChar + " ");
                }
                col++;
            }
            if (row < size - 1) {
                System.out.println();
            }
            row++;
        }
    }
}
