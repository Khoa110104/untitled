package train.search.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public int searchWithLoop(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - 1) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int searchWithRecursion(int[] array, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - 1) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                return searchWithRecursion(array, left, mid - 1, key);
            } else {
                return searchWithRecursion(array, mid + 1, right, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Key = ");
        int key = scanner.nextInt();
//        long t0 = System.currentTimeMillis();
        int resultLoop = new BinarySearch().searchWithLoop(array, key);
//        long t1 = scanner.nextInt();
        int resultRecursion = new BinarySearch().searchWithRecursion(array, 0, array.length, key);
//        long t2 = System.currentTimeMillis();
//        System.out.println("Result Loop : " + resultLoop + " time : " + (t1 - t0));
//        System.out.println("Result Recursion : " + resultRecursion + " time : " + (t2 - t1));
        System.out.println(resultLoop);
        System.out.println(resultRecursion);
    }
}
