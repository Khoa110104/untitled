package oop.final2021.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int swapCount = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = temp;

                swapCount++;
            }
        }
        return swapCount;
    }
}
