package oop.homework.homework2.ex2.compareable;

import java.util.Arrays;

public class GenericMergeSort<T extends Comparable<T>> {
    public T[] merge(T[] array1, T[] array2) {
        int length = array1.length + array2.length;
        T[] result = Arrays.copyOf(array1, length);
        int i = 0, iArray1 = 0, iArray2 = 0;
        while (i < length) {
            if (iArray1 < array1.length && iArray2 < array2.length) {
                if (array1[iArray1].compareTo(array2[iArray2]) <= 0) {
                    result[i] = array1[iArray1];
                    i++;
                    iArray1++;
                } else {
                    result[i] = array2[iArray2];
                    i++;
                    iArray2++;
                }
            } else {
                if (iArray1 < array1.length) {
                    result[i] = array1[iArray1];
                    i++;
                    iArray1++;
                } else {
                    result[i] = array2[iArray2];
                    i++;
                    iArray2++;
                }
            }
        }
        return result;
    }

    public T[] mergeSort(T[] array, int low, int high) {
        if (low == high) {
            return Arrays.copyOfRange(array, low, high + 1);
        }
        System.out.println("Chia: " + low + " - " + high);
        int mid = (low + high) / 2;
        T[] array1 = mergeSort(array, low, mid);
        T[] array2 = mergeSort(array, mid + 1, high);
        T[] result = merge(array1, array2);
        System.out.println("Ket qua Merge: " + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        //Integer
        System.out.println("------------Integer------------");
        GenericMergeSort genericMergeSort = new GenericMergeSort();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        genericMergeSort.mergeSort(intArray, 0, intArray.length-1);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        //String
        System.out.println("------------String------------");
        String[] stringArray = {"apple", "banana", "coconut", "orange", "cherry"};
        genericMergeSort.mergeSort(stringArray, 0, stringArray.length-1);
        System.out.println("Sorted String Array: " + Arrays.toString( genericMergeSort.mergeSort(stringArray, 0, stringArray.length-1)));
    }
}
