package oop.lab.lab4;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = in.nextInt();
        printNumberList(aPosInt);
    }

    public static boolean isPerfect(int aPosInt) {
        if (aPosInt < 0) {
            return false;
        }
        int sum = 0;
        int division = 1;
        while (division <= aPosInt / 2) {
            if (aPosInt % division == 0) {
                sum += division;
            }
            division++;
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        if (aPosInt < 0) {
            return false;
        }
        int sum = 0;
        int division = 1;
        while (division <= aPosInt / 2) {
            if (aPosInt % division == 0) {
                sum += division;
            }
            division++;
        }
        return sum < aPosInt;
    }

    public static void printNumberList(int aPosInt) {
        System.out.println("These numbers are perfect:");
        int countPerfectNum = 0;
        for (int i = 1; i <= aPosInt; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfectNum++;
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%c)]", countPerfectNum,
                (double) countPerfectNum / aPosInt * 100, '%');
        System.out.println();
        System.out.println("These number are neither deficient nor perfect:");
        int count = 0;
        for (int i = 1; i <= aPosInt; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%c)]", count,
                (double) count / aPosInt * 100, '%');
    }
}

