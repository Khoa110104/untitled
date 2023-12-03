package oop.lab.lab10.strategypattern.sort;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swapCount = 0;
        int length = data.length;
        for (int i = 1; i < length; ++i) {
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
