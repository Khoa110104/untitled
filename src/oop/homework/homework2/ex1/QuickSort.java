package oop.homework.homework2.ex1;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        } else {
            int pivot = array[(low + high) / 2];
            int pivotIndex = partition(array, low, high, pivot);
//            System.out.println("Low= " + low + " High= " + high + " pivot= " + pivot + " pivotIdx= " + pivotIndex);
//            System.out.println(Arrays.toString(Arrays.copyOfRange(array, low, high + 1)));
//            System.out.println("------------------------------------");
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex, high);
        }
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        int iLeft = left;
        int iRight = right;
        while (iLeft <= iRight) {
            while (array[iLeft] < pivot) {
                iLeft++;
            }
            while (array[iRight] > pivot) {
                iRight--;
            }
            if (iLeft <= iRight) {
                swap(array, iLeft, iRight);
                iLeft++;
                iRight--;
            }
        }
        return iLeft;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
