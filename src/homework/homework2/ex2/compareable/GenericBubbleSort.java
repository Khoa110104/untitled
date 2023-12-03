package homework.homework2.ex2.compareable;

import java.util.Arrays;

public class GenericBubbleSort<T extends Comparable<T>> {
    public void bubbleSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            print(array);
            System.out.println("----------------------------------");
        }
    }

    public void print(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        //Integer
        System.out.println("------------Integer------------");
        GenericBubbleSort genericBubbleSort = new GenericBubbleSort();
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        genericBubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        //String
        System.out.println("------------String------------");
        String[] stringArray = {"apple", "banana", "coconut", "orange", "cherry"};
        genericBubbleSort.bubbleSort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
