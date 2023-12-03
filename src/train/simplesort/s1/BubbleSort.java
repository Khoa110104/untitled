package train.simplesort.s1;

public class BubbleSort {
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(int[] array, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
            printArray(array);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        new BubbleSort().bubbleSort(a, a.length);
    }
}
