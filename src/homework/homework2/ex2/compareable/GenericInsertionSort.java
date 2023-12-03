package homework.homework2.ex2.compareable;

import java.util.Arrays;

public class GenericInsertionSort<T extends Comparable<T>> {
    public void insertionSort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            print(arr);
        }
    }

    public void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Integer
        System.out.println("------------Integer------------");
        GenericInsertionSort genericInsertionSort = new GenericInsertionSort();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        genericInsertionSort.insertionSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        //String
        System.out.println("------------String------------");
        String[] stringArray = {"apple", "banana", "coconut", "orange", "cherry"};
        genericInsertionSort.insertionSort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}