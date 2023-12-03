package oop.final2021.sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class App {
    private  static int[] randomIntArray() {
        Random random = new Random();
        int length = random.nextInt(10);
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(10);
        }
        return data;
    }
    private static String printArray(int[] data) {
        return Arrays.toString(data).replaceAll(",", "");
    }
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10
        int[] data = randomIntArray();
//        int[] data = {5, 4, 3, 2, 1};
        SortStrategy sortStrategy = SortStrategy.getInstance();

        ISort bubbleSort = new BubbleSort();
        sortStrategy.setSortee(bubbleSort);

        int[] newData = Arrays.copyOf(data, data.length);
        System.out.println("Using Bubble Sort Algorithm:");
        System.out.println("Before sorting: " + printArray(newData));
        int swapCount = sortStrategy.sort(newData);
        System.out.println("After sorting: " + printArray(newData));
        System.out.println("Number of swap: " + swapCount);

        ISort selectionSort = new SelectionSort();
        sortStrategy.setSortee(selectionSort);

        newData = Arrays.copyOf(data, data.length);
        System.out.println("Using Selection Sort Algorithm:");
        System.out.println("Before sorting: " + printArray(newData));
        swapCount = sortStrategy.sort(newData);
        System.out.println("After sorting: " + printArray(newData));
        System.out.println("Number of swap: " + swapCount);

        ISort insertionSort = new InsertionSort();
        sortStrategy.setSortee(insertionSort);

        newData = Arrays.copyOf(data, data.length);
        System.out.println("Using Insertion Sort Algorithm:");
        System.out.println("Before sorting: " + printArray(newData));
        swapCount = sortStrategy.sort(newData);
        System.out.println("After sorting: " + printArray(newData));
        System.out.println("Number of swap: " + swapCount);
    }
}
