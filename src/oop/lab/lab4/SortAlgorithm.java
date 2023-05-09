package oop.lab.lab4;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2};
//        selectionSort(array);
//        insertionSort(array);
        bubbleSort(array);
        print(array);
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minInx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minInx] > array[j]) {
                    minInx = j;
                }
            }
            if (minInx != i) {
                int temp = array[minInx];
                array[minInx] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int index = i - 1;
            while ((index >= 0) && (array[index] > key)) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = key;
        }
    }
}
