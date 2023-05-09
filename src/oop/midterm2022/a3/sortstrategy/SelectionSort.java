package oop.midterm2022.a3.sortstrategy;

public class SelectionSort implements ISort {

    public SelectionSort() {

    }

    @Override
    public int sort(int[] data) {
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
