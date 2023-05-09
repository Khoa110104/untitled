package oop.midterm2022.a3.sortstrategy;

public class InsertionSort implements ISort {
    public InsertionSort() {

    }

    @Override
    public int sort(int[] data) {
        int swapCount = 0;
        for (int i = 1; i < data.length; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
                swapCount++;
            }
            data[j + 1] = key;
            swapCount++;
        }
        return swapCount;
    }
}
