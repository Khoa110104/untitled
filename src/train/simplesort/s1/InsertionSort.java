package train.simplesort.s1;

public class InsertionSort {
    public void shiftElement(int[] a, int i) {
        int temp = a[i];
        while (i > 0 && a[i - 1] > temp) {
            a[i] = a[i - 1];
            i--;
        }
        a[i] = temp;
    }

    public void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++)
            if (a[i] < a[i - 1])
                shiftElement(a, i);
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        new InsertionSort().insertionSort(a, a.length);
        for (int i : a)
            System.out.print(i + " ");
    }
}
