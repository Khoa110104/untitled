package homework.homework2.ex1;


public class SelectionSort {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int array[]) {
        int n = array.length;
        int swapCount = 0;
        int compareCount = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                compareCount++;
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, minIndex, i);
                swapCount++;
                System.out.println("---------------");
                printArray(array);
            }
        }
        System.out.println("Sorted!!!");
        System.out.println("Swap: " + swapCount);
        System.out.println("Compare: " + compareCount);
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}