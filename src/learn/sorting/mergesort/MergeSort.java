package learn.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {
    public int[] merge(int[] array1, int[] array2) {
        int n = array1.length + array2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < array1.length && i2 < array2.length) { // a1 & a2 != rỗng
                if (array1[i1] <= array2[i2]) { // a1 nhỏ hơn
                    result[i] = array1[i1];
                    i++;
                    i1++;
                } else { // a2 nhỏ hơn
                    result[i] = array2[i2];
                    i++;
                    i2++;
                }
            } else { //a1 rỗng hoặc a2 rỗng
                if (i1 < array1.length) { //a1 ok
                    result[i] = array1[i1];
                    i++;
                    i1++;
                } else { // a2 ok
                    result[i] = array2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public int[] mergeSort(int[] array, int L, int R) {
        // THDB DKD
        if (L > R)
            return new int[0];
        if (L == R) {
            int[] singleElement = {array[L]};
            return singleElement;
        }

        //Chia ra
        System.out.println("Chia: " + L + " - " + R );
        int k = (L + R) / 2;
        int[] array1 = mergeSort(array, L, k);
        int[] array2 = mergeSort(array, k + 1, R);

        //Trộn vào: a2 và a1 là các mảng đã được sắp xếp
        int[] result = merge(array1, array2);
        System.out.println("Ket qua Merge: "  + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
//        int[] array1 ={1,3,5,7,9};
//        int[] array2 = {2,4,6,8,10};
        int[] array3 = {1, 5, 3, 2, 8, 7, 6, 4};
        System.out.println(Arrays.toString(mergeSort.mergeSort(array3, 0, array3.length - 1)));
//        System.out.println(Arrays.toString(mergeSort.merge(array1,array2)));
    }
}
// độ phức tạp: n * logn