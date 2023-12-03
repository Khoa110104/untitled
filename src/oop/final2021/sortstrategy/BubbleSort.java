package oop.final2021.sortstrategy;

public class BubbleSort implements ISort {
    public BubbleSort() {
    }

    @Override
    public int sort(int[] data) {
        /* TODO */
        int swapCount = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
