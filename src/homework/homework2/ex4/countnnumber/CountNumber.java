package homework.homework2.ex4.countnnumber;

import java.util.Scanner;

public class CountNumber {
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

    public static void countWord(int[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                System.out.print(array[i - 1] + " " + count + "; ");
                count = 1;
            }
        }
        System.out.println(array[array.length - 1] + " " + count + ";");
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
        quickSort(array, 0, array.length - 1);
        countWord(array);
    }
}
