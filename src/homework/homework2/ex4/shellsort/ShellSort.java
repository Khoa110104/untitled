package homework.homework2.ex4.shellsort;

import java.util.Date;
import java.util.Scanner;

public class ShellSort {
    public static int shellSort(int[] array) {
        int n = array.length;
        for (int x = n / 2; x > 0; x /= 2) {
            for (int i = x; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= x && array[j - x] > temp; j -= x) {
                    array[j] = array[j - x];
                }
                array[j] = temp;
            }
        }
        return 0;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Import elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        shellSort(array);
        printArray(array);
    }
}
