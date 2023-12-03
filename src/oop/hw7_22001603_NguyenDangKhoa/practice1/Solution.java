package oop.hw7_22001603_NguyenDangKhoa.practice1;

import java.util.Scanner;

public class Solution {
    static int isRepresentingBST(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Element: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Là dãy duyệt giữa của cây tìm kiếm nhị phân(1:có, 0:không) : " + isRepresentingBST(array,length));
    }
}
