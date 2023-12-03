package train.simplesort.s2;
//update
public class SelectionSort {
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void selectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[minIndex] >array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array,minIndex, i);
                printArray(array);
            }
        }
    }
    public void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        new SelectionSort().selectionSort(a);
    }
}