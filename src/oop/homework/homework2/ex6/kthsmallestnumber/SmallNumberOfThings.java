package oop.homework.homework2.ex6.kthsmallestnumber;

import java.util.Scanner;

public class SmallNumberOfThings {
    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = array[(low + high) / 2];
        int pivotIdx = partition(array, low, high, pivot);
        quickSort(array, low, pivotIdx - 1);
        quickSort(array, pivotIdx, high);

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        int iLeft = left;
        int iRight = right;
        while (iLeft <= iRight) {
            while (array[iLeft] < pivot) {
                iLeft++;
            }
            while (array[iRight] > pivot) {
                iRight--;
            }
            if (iLeft <= iRight) {
                int temp = array[iLeft];
                array[iLeft] = array[iRight];
                array[iRight] = temp;
                iLeft++;
                iRight--;
            }
        }
        return iLeft;
    }

    public static void findingNumber(int[] array, int k) {
        if (array == null || k > array.length) {
            System.out.print("Does not exist!!!");
        } else {
            quickSort(array, 0, array.length - 1);
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
                System.out.println("Small number of things " + k + " is: " + array1[k - 1]);
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
