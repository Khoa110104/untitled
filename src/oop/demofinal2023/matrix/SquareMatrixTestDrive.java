package oop.demofinal2023.matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        Random random = new Random();
//        int size = random.nextInt(4) ;
        int size = random.nextInt(5) + 5;
        SquareMatrix matrix1 = new SquareMatrix(size);
        SquareMatrix matrix2 = new SquareMatrix(size);

//      - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
        System.out.println("Matrix1:");
        System.out.println(matrix1);
        System.out.println("Matrix Transpose:");
        System.out.println(matrix1.transpose());

        System.out.println("Matrix2:");
        System.out.println(matrix2);
        System.out.println("Matrix Transpose:");
        System.out.println(matrix2.transpose());

//      -In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
        System.out.println("Matrix1:");
        System.out.println("Primary diagonal: ");
        System.out.println(Arrays.toString(matrix1.principalDiagonal()));
        System.out.println("Second diagonal: ");
        System.out.println(Arrays.toString(matrix1.secondaryDiagonal()));

        System.out.println("Matrix2:");
        System.out.println("Primary diagonal: ");
        System.out.println(Arrays.toString(matrix2.principalDiagonal()));
        System.out.println("Second diagonal: ");
        System.out.println(Arrays.toString(matrix2.secondaryDiagonal()));

//      - In ra ma trận là ma trận tổng của 2 ma trận.
        System.out.println("Sum of 2 matrix: ");
        System.out.println(matrix1.add(matrix2));

//       - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
        System.out.println("Subtract of 2 matrix: ");
        System.out.println(matrix1.minus(matrix2));

//       - In ra ma trận là ma trận tích của 2 ma trận.
        System.out.println("Multiply of 2 matrix: ");
        System.out.println(matrix1.multiply(matrix2));

//      In ra các số nguyên tố có trong ma trận.
        System.out.println("Primes of matrix1: ");
        System.out.println(Arrays.toString(matrix1.primes()));
        System.out.println("Primes of matrix2: ");
        System.out.println(Arrays.toString(matrix2.primes()));

//      In ra ma trận được sắp xếp
        System.out.println("Sort matrix1: ");
        System.out.println(matrix1.getSortedMatrix());
        System.out.println("Sort matrix2: ");
        System.out.println(matrix2.getSortedMatrix());

    }

}
