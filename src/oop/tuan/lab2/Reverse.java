package oop.tuan.lab2;

import java.util.Scanner;

public class Reverse {
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
        in.close();
        reverse(array);
        System.out.print("Reverse array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
