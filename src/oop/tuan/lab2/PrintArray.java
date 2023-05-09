package oop.tuan.lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        if (NUM_ITEMS < 0) {
            System.out.print("Invalid Input.....!!");
            return;
        }
        items = new int[NUM_ITEMS];
        if (items.length == 0) {
        } else {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }
        }
        in.close();
        printArray(items);
    }

    public static void printArray(int[] items) {
        System.out.print("The value are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.print(items[0]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
    }
}
