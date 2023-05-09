package oop.lab.homework1;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        final char MYCHAR = '#';
        printBoxPatternA(size, MYCHAR);
        System.out.println();
        System.out.println("--------------------------");
        printBoxPatternB(size, MYCHAR);
        System.out.println();
        System.out.println("--------------------------");
        printBoxPatternC(size, MYCHAR);
        System.out.println();
        System.out.println("--------------------------");
        printBoxPatternD(size, MYCHAR);
    }

    public static void printBoxPatternA(int size, char myChar) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || col == 1 || col == size - 1) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printBoxPatternB(int size, char myChar) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || row == col) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printBoxPatternC(int size, char myChar) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || col == size - row) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printBoxPatternD(int size, char myChar) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || col == size - row || col == row) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }
}
