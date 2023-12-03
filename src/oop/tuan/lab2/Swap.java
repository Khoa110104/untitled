package oop.tuan.lab2;

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
//    Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the base: ");
//                int base = sc.nextInt();
//                System.out.print("Enter the exponent: ");
//                int exp = sc.nextInt();
//                System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
//
//                System.out.println();
//                printMagicSum(sc);
//                int[] arrayTest = {1,9,10,24,90,160,-55};
//                int[] arrayInteger = {1, 2, 3, 4, 5};
//                double[] arrayDouble = {1.2, 2.3, 3.4, 5.0, 10d};
//                float[] arrayFloat = {100f, 300.9f, 1000.005f, 2023.5f};
//                System.out.println("Print integer array: ");
//                print(arrayInteger);
//                System.out.println("Print double array: ");
//                print(arrayDouble);
//                System.out.println("Print float array: ");
//                print(arrayFloat);
//
//                String myString = arrayToString(arrayInteger);
//                System.out.println("Print array to string: ");
//                System.out.println(myString);
//                //BasicStatistics method contain
//                System.out.println(contains(arrayInteger,3));
//                //BasicStatistics method search
//                System.out.println(search(arrayTest,-100));
//                //BasicStatistics method equals
//                System.out.println(equals(arrayTest,arrayInteger));
//                //BasicStatistics method swap
//                System.out.println(swap(arrayTest,arrayInteger));
//                print(arrayTest);
//                print(arrayInteger);
//                //BasicStatistics method reverse
//                reverse(arrayInteger);
//                print(arrayInteger);
