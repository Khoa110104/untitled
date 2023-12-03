package train.array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int n;
        int m;
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int size = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[size] = a[i];
                size += 1;
                i += 1;
            } else {
                c[size] = b[j];
                size += 1;
                j += 1;
            }
        }
        while (i < n) {
            c[size] = a[i];
            size += 1;
            i += 1;
        }
        while (j < m) {
            c[size] = b[j];
            size += 1;
            j += 1;
        }
        for (int k = 0; k < size; k++) {
            System.out.print(c[k] + " ");
        }
    }
}
