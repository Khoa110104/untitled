package oop.tuan.lab2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        int[] array = new int[size];
        if (array.length > 0) {
            System.out.print("Enter the integer value (separated by space): ");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
        }
        print(array);
        double[] arrayDouble = new double[size];
        if (arrayDouble.length > 0) {
            System.out.print("Enter the double value (separated by space): ");
            for (int i = 0; i < arrayDouble.length; i++) {
                arrayDouble[i] = in.nextDouble();
            }
        }
        print(arrayDouble);
        float[] arrayFloat = new float[size];
        if (arrayFloat.length > 0) {
            System.out.print("Enter the float value (separated by space): ");
            for (int i = 0; i < arrayFloat.length; i++) {
                arrayFloat[i] = in.nextFloat();
            }
        }
        in.close();
        print(arrayFloat);
    }

    public static void print(int[] array) {
        System.out.print("The integer value are: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(double[] arrayDouble) {
        System.out.print("The double value are: [");
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if (i != arrayDouble.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }

    public static void print(float[] arrayFloat) {
        System.out.print("The float value are: [");
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i != arrayFloat.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.print("]");
    }

}
