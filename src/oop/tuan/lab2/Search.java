package oop.tuan.lab2;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter th size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        if (arr.length > 0) {
            System.out.print("Enter the value(separated by space): ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }
        in.close();
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        System.out.println("The index of the key in the array is: " + search(arr, key));
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
