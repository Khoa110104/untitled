package oop.lab.lab10.strategypattern.sort;

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

        int[] data = randomIntArray();
        printArray(data);

        SortStrategy sortStrategy = new SortStrategy();

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
