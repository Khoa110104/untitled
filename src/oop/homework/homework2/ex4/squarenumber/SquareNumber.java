package oop.homework.homework2.ex4.squarenumber;

import java.util.Arrays;
import java.util.Scanner;

public class SquareNumber {
    public static boolean isSquareNumber(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }

    public static void quickSort(int[] array, int L, int R) {
        if (L >= R)
            return;
        int key = array[(L + R) / 2];
        int k = partition(array, L, R, key);
        quickSort(array, L, k - 1);
        quickSort(array, k, R);
    }

    public static int partition(int[] array, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            while (array[iL] < key)
                iL++;
            while (array[iR] > key)
                iR--;
            if (iL <= iR) {
                int temp = array[iL];
                array[iL] = array[iR];
                array[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void printArray(int[] array, int n) {
        if (array == null || n == 0) {
            System.out.println("NULL");
        } else {
            System.out.print(array[0] + " ");
            for (int i = 1; i < n; i++) {
                if (array[i] != array[i - 1]) {
                    System.out.print(array[i] + " ");
                }
            }
        }

    }

    public static void squareNumber(int[] array1) {
        int[] array2 = new int[array1.length];
        int k = 0;
        for (int i : array1) {
            if (isSquareNumber(i)) {
                array2[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("NULL");
        } else {
            quickSort(array2, 0, k - 1);
            printArray(array2, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array1 = new int[length];
        System.out.print("Import elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        squareNumber(array1);
    }
}
