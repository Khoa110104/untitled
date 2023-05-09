package oop.lab.lab4;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 6, 7, 8, 9};
        System.out.println(linearSearch(array, 3));
        System.out.println(linearSearchIndex(array, 3));
        SortAlgorithm.insertionSort(array);
        System.out.println(binarySearch(array, 3, 0, array.length ));
    }

    public static boolean linearSearch(int[] array, int key) {
        if (array.length == 0) {
            return false;
        }
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] sortedArray, int key, int from, int to) {
        while (from < to) {
            int mid = from + (to - from) / 2;
            if (key == sortedArray[mid]) {
                return true;
            }
            if (key < sortedArray[mid]) {
                to = mid - 1;
            } else {
                from = mid + 1;
            }
        }
        return false;
    }
}
