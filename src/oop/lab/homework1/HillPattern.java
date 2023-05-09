package oop.lab.homework1;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        final char MY_CHAR = '#';
        printHillPatternA(size, MY_CHAR);
        System.out.println();
        System.out.println("--------------------");
        printHillPatternB(size, MY_CHAR);
        System.out.println();
        System.out.println("--------------------");
        printHillPatternC(size, MY_CHAR);
        System.out.println();
        System.out.println("--------------------");
        printHillPatternD(size, MY_CHAR);
    }

    public static void printHillPatternA(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col >= size - 1 - row && col <= size - 1 + row) {
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

    public static void printHillPatternB(int size, char myChar) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col >= row && col <= size * 2 - 2 - row) {
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

    public static void printHillPatternC(int size, char myChar) {
        for (int row = 1; row <= size; row++) {
            int numCol = 2 * size - 1;
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = size; row > 0; row--) {
            int numCol = 2 * size - 1;
            for (int col = numCol; col > 0; col--) {
                if ((row + col >= size + 2) && (row >= col - size + 2)) {
                    System.out.print(myChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (row > 1) {
                System.out.println();
            }
        }
    }

    public static void printHillPatternD(int size, char myChar) {
        for (int row = 1; row <= size; row++) {
            int numCol = 2 * size - 1;
            for (int col = 1; col <= numCol; col++) {
                if ((row + col >= size + 2) && (row >= col - size + 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print(myChar + " ");
                }
            }
            System.out.println();
        }
        for (int row = size; row > 0; row--) {
            int numCol = 2 * size - 1;
            for (int col = numCol; col > 0; col--) {
                if ((row + col >= size + 2) && (row >= col - size + 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print(myChar + " ");
                }
            }
            if (row > 1) {
                System.out.println();
            }
        }
    }

}

