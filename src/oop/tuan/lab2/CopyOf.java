package oop.tuan.lab2;

import java.util.Scanner;

public class CopyOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        if (array.length > 0) {
            System.out.print("Enter the value(separated by space): ");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
        }
        System.out.print("Copy of array is: ");
        printCopyOfArray(copyOf(array));
        System.out.println();
        System.out.print("Enter the new length: ");
        int newLength = in.nextInt();
        in.close();
        System.out.print("Copy of array is: ");
        printCopyOfArray(copyOf(array, newLength));
    }

    public static int[] copyOf(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyOfArray1 = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                copyOfArray1[i] = array[i];
            } else {
                copyOfArray1[i] = 0;
            }
        }
        return copyOfArray1;
    }

    public static void printCopyOfArray(int[] copyOfArray) {
        for (int i = 0; i < copyOfArray.length; i++) {
            System.out.print(copyOfArray[i]);
            if (i != copyOfArray.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
