package learn;

public class TopK{

    /*
        Hoàn thiện phương thức getTopk trả lại giá trị lớn thứ k trong dãy
        k <= a.length
    */
    public static int getTopk(int[] a, int k)
    {
        bubbleSort(a);
        return a[k-1];
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    swap(array, j, j+1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 3, 2, 1, 4, 5, 7, 9, 8, 5, 6};
        int k = 1;

        System.out.printf("Phần tử lớn thứ %d là: %d",k,getTopk(a,k));

    }
}