package oop.homework.homework2.ex6.kthlargestnumber;

import java.util.Scanner;

public class LargeNumberOfThings {
    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            if (array[i] > array[i - 1]) {
                transitionElement(array, i);
            }
        }
    }

    public static void transitionElement(int[] array, int i) {
        int temp = array[i];
        while (i > 0 && array[i - 1] < temp) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = temp;
    }

    public static void findingNumber(int[] array, int k) {
        if (array == null || k > array.length) {
            System.out.print("Does not exist!!!");
        } else {
            insertionSort(array);
            int[] array1 = new int[array.length];
            array1[0] = array[0];
            int index = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    array1[index] = array[i];
                    index++;
                }
            }
            if (k > index) {
                System.out.print("Does not exist!!!");
            } else {
                System.out.println("Large number of things " + k + " is: " + array1[k - 1]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length and k: ");
        int length = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Import elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        findingNumber(array, k);
    }
}
