package oop.lab.homework1;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        final char MYCHAR = '#';
        printTriangularPatternA(size, MYCHAR);
        System.out.println();
        System.out.println("-------------------------");
        printTriangularPatternB(size, MYCHAR);
        System.out.println();
        System.out.println("-------------------------");
        printTriangularPatternC(size, MYCHAR);
        System.out.println();
        System.out.println("-------------------------");
        printTriangularPatternD(size, MYCHAR);
    }

    public static void printTriangularPatternA(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    System.out.print(myChar);
                } else if (row > col) {
                    System.out.print(myChar + " ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printTriangularPatternB(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size - 1 - row) {
                    System.out.print(myChar + " ");
                } else if (col == size - 1 - row) {
                    System.out.print(myChar);
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }

    public static void printTriangularPatternC(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col >= row) {
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

    public static void printTriangularPatternD(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col < size - 1 - row) {
                    System.out.print("  ");
                } else {
                    System.out.print(myChar + " ");
                }
            }
            if (row < size - 1) {
                System.out.println();
            }
        }
    }
}
