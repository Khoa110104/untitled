package homework.homework2.ex1;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int n = array1.length + array2.length;
        int[] result = new int[n];
        int i = 0, iArray1 = 0, iArray2 = 0;
        while (i < n) {
            if (iArray1 < array1.length && iArray2 < array2.length) {
                if (array1[iArray1] <= array2[iArray2]) {
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

    public static int[] mergeSort(int[] array, int low, int high) {
        if (low == high) {
            int[] singleElement = {array[low]};
            return singleElement;
        }
        System.out.println("Chia: " + low + " - " + high);
        int k = (low + high) / 2;
        int[] array1 = mergeSort(array, low, k);
        int[] array2 = mergeSort(array, k + 1, high);

        int[] result = merge(array1, array2);
        System.out.println("Ket qua Merge: " + Arrays.toString(result));
        return result;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
