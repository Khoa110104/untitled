package train.simplesort.s2;

import java.util.Random;

//update
public class BubbleSort {
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    swap(array, j, j + 1);
                }
            }
            if (isSorted) {
                break;
            }
//            System.out.println("Round " + i);
//            printArray(array);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Length: ");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        bubbleSort(array);
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt(100000);
            array[i] = x;
        }
        long start = System.nanoTime();
        bubbleSort(array);
        long end = System.nanoTime();
        long time = (long) ((end - start) / 1000000.0);
        System.out.println(time);
    }

}
