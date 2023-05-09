package oop.tuan.lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        if (array.length > 0) {
            System.out.print("Enter the value (separated by space): ");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
        }
        in.close();
        System.out.println("Array to string is: " + arrayToString(array));

    }

    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
