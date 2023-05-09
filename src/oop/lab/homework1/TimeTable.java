package oop.lab.homework1;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = in.nextInt();
        printTimeTable(size);
    }

    public static void printTimeTable(int size) {
        System.out.print("* | ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("----");
        for (int i = 1; i <= 10; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= 10; row++) {
            if (row < 10) {
                System.out.print(row + " | ");
            } else {
                System.out.print(row + "| ");
            }
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            if (row < 10) {
                System.out.println();
            }
        }
    }
}