package homework.homework2.ex2.compareable;

import java.util.Arrays;

public class GenericQuickSort<T extends Comparable<T>> {
    public int partition(T[] array, int left, int right, T pivot) {
        int iLeft = left;
        int iRight = right;
        while (iLeft <= iRight) {
            while (array[iLeft].compareTo(pivot) < 0)
                iLeft++;
            while (array[iRight].compareTo(pivot) > 0)
                iRight--;
            if (iLeft <= iRight) {
                swap(array, iLeft, iRight);
                iLeft++;
                iRight--;

            }
        }
        return iLeft;
    }

    public void quickSort(T[] array, int low, int high) {
        if (low >= high) {
            return;
        } else {
            T pivot = array[(low + high) / 2];
            int pivotIndex = partition(array, low, high, pivot);
            System.out.println("Low= " + low + " High= " + high + " pivot= " + pivot + " pivotIdx= " + pivotIndex);
            System.out.println(Arrays.toString(Arrays.copyOfRange(array, low, high + 1)));
            System.out.println("------------------------------------");
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex, high);
        }

    }

    public void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        //Integer
        System.out.println("------------Integer------------");
        GenericQuickSort genericQuickSort = new GenericQuickSort();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        genericQuickSort.quickSort(intArray, 0, intArray.length - 1);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        //String
        System.out.println("------------String------------");
        String[] stringArray = {"apple", "banana", "coconut", "orange", "cherry"};
        genericQuickSort.quickSort(stringArray, 0, stringArray.length-1);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
