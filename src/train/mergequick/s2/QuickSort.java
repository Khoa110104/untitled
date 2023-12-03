package train.mergequick.s2;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] array, int L, int R) {
        // Điều kiện đúng
        if (L>= R)
            return;
        // B1. Chọn khóa
        int key = array[(L+R) / 2]; // 0-7: (0+7) / 2 = 3 - mảng 8 phần tử
        // B2. Phân bố lại mảng theo khóa
        int k = partition(array, L, R, key);
        System.out.println("L= " + L + " R= " + R + " key= " + key + " k= " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,L,R+1)));
        System.out.println("====================");
        // B3. Chia đôi mảng => lặp lại
        quickSort(array, L, k-1);
        quickSort(array, k, R);
    }
    static int partition(int[] array, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // Với iL, đi tìm phần tử >= key để đổi chỗ
            while (array[iL] < key )
                iL++;
            // Với iR, đi tìm phần tử <= key để đổi chỗ
            while (array[iR] >key)
                iR--;
            // Đổi chỗ 2 phần tử đang đứng không đúng vị trí
            if (iL<=iR) {
                int temp = array[iL];
                array[iL] = array[iR];
                array[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] array = {6,7,8,5,4,1,2,3};
        System.out.println(Arrays.toString(array));
        System.out.println("Start");
        quickSort(array, 0, array.length-1);
        System.out.println("Finish");
        System.out.println(Arrays.toString(array));
    }
}
