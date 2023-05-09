package oop.midterm2022.a5.sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class App {
    private static int[] randomIntArray() {
        Random random = new Random();
        int n = random.nextInt(10);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    private static void printArray(int[] data) {
        System.out.println(Arrays.toString(data).replaceAll(",", ""));
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

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
        int[] data = randomIntArray();
        printArray(data);

        SortStrategy sortStrategy = SortStrategy.getInstance();

        ISort selectionSort = new SelectionSort();
        sortStrategy.setSortee(selectionSort);

        System.out.println("Using Selection Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(data);
        int[] newData = Arrays.copyOf(data, data.length);
        int swapCount = sortStrategy.sort(newData);
        System.out.print("After sorting: ");
        printArray(newData);
        System.out.println("Number of swap: " + swapCount);

        ISort insertionSort = new InsertionSort();
        sortStrategy.setSortee(insertionSort);

        System.out.println("Using InsertionSort Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(data);
        newData = Arrays.copyOf(data, data.length);
        swapCount = sortStrategy.sort(newData);
        System.out.print("After sorting: ");
        printArray(newData);
        System.out.println("Number of swap: " + swapCount);

        ISort bubbleSort = new BubbleSort();
        sortStrategy.setSortee(bubbleSort);

        System.out.println("Using BubbleSort Sort Algorithm:");
        System.out.print("Before sorting: ");
        printArray(data);
        newData = Arrays.copyOf(data, data.length);
        swapCount = sortStrategy.sort(newData);
        System.out.print("After sorting: ");
        printArray(newData);
        System.out.println("Number of swap: " + swapCount);
    }
}
