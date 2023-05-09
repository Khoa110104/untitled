package oop.lab.lab3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size array1: ");
        int size1 = in.nextInt();
        int[] array1 = new int[size1];
        if (array1.length > 0) {
            System.out.print("Enter the value(separated by space): ");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = in.nextInt();
            }
        }
        System.out.print("Enter the size array2: ");
        int size2 = in.nextInt();
        int[] array2 = new int[size2];
        if (array2.length > 0) {
            System.out.print("Enter the value(separated by space): ");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = in.nextInt();
            }
        }
        in.close();
        System.out.println(swap(array1, array2));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }
}
