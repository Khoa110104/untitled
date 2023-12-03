package homework.homework2.ex1;

public class InsertionSort {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void insertionSort(int[] array) {
        int n = array.length;
        int swapCount = 0;
        int compareCount = 0;
        for (int i = 1; i < n; i++) {
//            compareCount++;
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                while (i > 0 && array[i - 1] > temp) {
                    array[i] = array[i - 1];
                    i--;
//                    compareCount++;
//                    swapCount++;
                }
                array[i] = temp;
//                printArray(array);
//                System.out.println("-----------------------");
            }
        }
//        System.out.println("Sorted!!!");
//        System.out.println("Swap: " + swapCount);
//        System.out.println("Compare: " + compareCount);
    }

}