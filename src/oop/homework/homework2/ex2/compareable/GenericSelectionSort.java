package oop.homework.homework2.ex2.compareable;

import java.util.Arrays;

public class GenericSelectionSort<T extends Comparable<T>> {
    public void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, minIndex, i);
                print(array);
            }
        }
    }

    public void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        GenericSelectionSort genericSelectionSort = new GenericSelectionSort();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        genericSelectionSort.selectionSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        //String
        System.out.println("------------String------------");
        String[] stringArray = {"apple", "banana", "coconut", "orange", "cherry"};
        genericSelectionSort.selectionSort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
