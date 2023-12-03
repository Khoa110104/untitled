package train.simplesort.s2;
//update
public class InsertionSort {
    public void printArray(int[] array) {
        for (int i =0 ; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void shiftElement(int[] array, int i) {
        int temp = array[i];
        while (i > 0 && array[i - 1] > temp) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = temp;
        printArray(array);
    }

    public void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++)
            if (array[i] < array[i - 1])
                shiftElement(array, i);
        System.out.println("Sorted");
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        new InsertionSort().insertionSort(a);
    }
}