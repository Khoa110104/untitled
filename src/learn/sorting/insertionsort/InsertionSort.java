package learn.sorting.insertionsort;

import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int[] array) {
        for (int i =0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void shiftElement(int[] array, int i) {
        int temp = array[i];
        while (i > 0 && array[i - 1] > temp) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = temp;
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++)
            if (array[i] < array[i - 1])
                shiftElement(array, i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }
        insertionSort(array );
    }
}