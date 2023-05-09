package oop.midterm2022.a5.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swapCount = 0;
        boolean swapped;
        for (int i = 0; i < data.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (swapped == false)
                break;
        }
        return swapCount;
    }
}