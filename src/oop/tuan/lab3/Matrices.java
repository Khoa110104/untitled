package oop.tuan.lab3;

import java.util.Random;

public class Matrices {
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(3, 4);
        print(matrix);
        System.out.println();

        int[][] matrix1 = new int[4][5];
        createRandomMatrix(matrix1);
        print(matrix1);
        System.out.println();

        print(add(matrix, matrix1));
        System.out.println();

        print(subtract(matrix, matrix1));
        System.out.println();

        int[][] matrix2 = createRandomMatrix(4, 3);
        print(matrix2);
        System.out.println();

        print(multiply(matrix, matrix2));
    }

    public static void createRandomMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("NULL...!!!");
            return;
        }
        Random random = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = random.nextInt(100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            return null;
        }
        int[][] matrix = new int[rows][cols];
        createRandomMatrix(matrix);
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (matrix == null) {
            System.out.println("NULL...!!!");
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col == matrix[0].length - 1) {
                    System.out.print(matrix[row][col]);
                } else {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            if (row < matrix.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Invalid input...!!!");
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col == matrix[0].length - 1) {
                    System.out.print(matrix[row][col]);
                } else {
                    System.out.print(matrix[row][col] + " ");
                }
            }
            if (row < matrix.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean haveSameDimension(int[][] matrix1,
                                            int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1,
                                            double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;

    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static double[][] add(double[][] matrix1,
                                 double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static double[][] subtract(double[][] matrix1,
                                      double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrix1.length; row++) {
                for (int col = 0; col < matrix1[0].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static boolean isMatrixInput(int[][] matrix) {
        return matrix != null && matrix.length >= 1 && matrix[0].length >= 1;
    }

    public static boolean isMatrixInput(double[][] matrix) {
        return matrix != null && matrix.length >= 1 && matrix[0].length >= 1;
    }

    public static boolean hasMultiply(int[][] matrix1, int[][] matrix2) {
        return isMatrixInput(matrix1) && isMatrixInput(matrix2) && matrix1.length == matrix2[0].length;
    }

    public static boolean hasMultiply(double[][] matrix1,
                                      double[][] matrix2) {
        return isMatrixInput(matrix1) && isMatrixInput(matrix2) && matrix1.length == matrix2[0].length;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (hasMultiply(matrix1, matrix2)) {
            int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static int[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (hasMultiply(matrix1, matrix2)) {
            int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return newMatrix;
        }
        return null;
    }
}
