package oop.lab.lab3;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        if (arr.length > 0) {
            System.out.print("Enter the value (separated by space): ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.println("Key appear in the array: " + contains(arr, key));
    }

    public static boolean contains(int[] array, int key) {
        if (array.length == 0 || array == null) {
            return false;
        }
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
