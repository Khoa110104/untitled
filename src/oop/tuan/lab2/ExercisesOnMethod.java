package oop.tuan.lab2;

import java.util.Scanner;

public class ExercisesOnMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the base: ");
//        int base = in.nextInt();
//        System.out.print("Enter the exponent: ");
//        int exp = in.nextInt();
//        System.out.println(base + " raises to the power of " + exp
//                + " is: " + exponent(base, exp));
//        printMagicSum(in);
        int[] array = {1, 2, 3, 4};
//        int[] arrayInteger = {};
//        double[] arrayDouble = {3.3, 3.5, 3.336};
//        float[] arrayFloat = {3.2f, 6.9f, 3.33f, 5.5f};
//        print(arrayInteger);
//        print(arrayDouble);
//        print(arrayFloat);
        System.out.println(arrayToString(array));
//        System.out.print("Enter the key: ");
//        int key = in.nextInt();
//        System.out.println(contains(array, key));
//        System.out.println(search(array, key));
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = {1, 2, 2, 3};
//        System.out.println(equals(array1, array2));
//        System.out.println(copyOf(array));
//        reverse(array);
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            int tmp = number % 10;
            if (tmp == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void printMagicSum(Scanner in) {
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (number != SENTINEL) {
                if (hasEight(number)) {
                    sum += number;
                }
            } else {
                System.out.println("The magic sum is: " + sum);
                break;
            }
        }
    }

    public static void print(int[] arrayInteger) {
        if (arrayInteger == null) {
            System.out.println("Invalid input...!!");
            return;
        }
        System.out.print("The integer value are: [");
        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print(arrayInteger[i]);
            if (i != arrayInteger.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(double[] arrayDouble) {
        if (arrayDouble == null) {
            System.out.println("Invalid input...!!");
            return;
        }
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
        if (arrayFloat == null) {
            System.out.println("Invalid input...!!");
            return;
        }
        System.out.print("The float value are: [");
        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i != arrayFloat.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.print("]");
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            String stringResult = "[]";
            return stringResult;
        }
        StringBuilder stringArray = new StringBuilder();
        stringArray.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            stringArray.append(array[i]).append(", ");
        }
        stringArray.append(array[array.length - 1]).append("]");
        return stringArray.toString();

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

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        if (array == null) {
            return null;
        }
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        if (newLength < 0) {
            int[] newArray = {-1};
            return newArray;
        }
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

    public static boolean swap(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
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

    public static void reverse(int[] array) {
        if (array == null) {
            System.out.println("Invalid input...!!");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}
