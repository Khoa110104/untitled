package oop.homework.homework2.ex1;

public class BubbleSort {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0;
        int compareCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                compareCount++;
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    swap(array, j, j + 1);
                    swapCount++;
                }
            }
            if (isSorted) {
//                System.out.println("Sorted!!!");
                break;
            }
//            System.out.println("-----------------");
//            printArray(array);
        }
//        System.out.println("Swap: " + swapCount);
//        System.out.println("Compare: " + compareCount);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
