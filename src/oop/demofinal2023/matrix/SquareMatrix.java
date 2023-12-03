package oop.demofinal2023.matrix;

import java.util.*;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        if (size < 0) {
            System.out.println("Error input!!!");
            return;
        }
        Random random = new Random();
         data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i][i];
        }
        return arr;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (i + j == data.length - 1) {
                    arr[i] = data[i][j];
                }
            }
        }
        return arr;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     *
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        /* TODO */
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                if (isPrime(data[i][j])) {
//                    list.add(data[i][j]);
//                }
//            }
//        }
//        int[] arr = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }
//        return arr;
        Set<Integer> set = new HashSet<>();
        for (int[] array : data) {
            for (int i : array) {
                if (isPrime(i)) {
                    set.add(i);
                }
            }
        }
        int[] result = new int[set.size()];
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     *
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
//                ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int[] arr : data) {
//            for (int i : arr) {
//                arrayList.add(i);
//            }
//        }
//        Collections.sort(arrayList);
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                data[i][j] = arrayList.get(i * data.length + j);
//            }
//        }
//        return this;

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] arr : data) {
            for (int i : arr) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int[][] result = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result[i][j] = list.get(i * data.length + j);
            }
        }
        SquareMatrix squareMatrix = new SquareMatrix(0);
        squareMatrix.data = result;
        return squareMatrix;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     *
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        if (row < 0 || row >= data.length || col < 0 || col >= data[0].length) {
            System.out.println("Can't get!!!");
            return -1;
        }
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        /* TODO */
        if (row < 0 || row >= data.length || col < 0 || col >= data[0].length) {
            System.out.println("Can't set!!!");
            return;
        }
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        /* TODO */
        //        if (that.data.length != data.length) {
//            return this;
//        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                data[i][j] += that.data[i][j];
//            }
//        }
//        return this;

        if (data.length != that.data.length) {
            System.out.println("Invalid size!!!");
            return null;
        }
        SquareMatrix result = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result.data[i][j] = data[i][j] + that.get(i, j);
            }
        }
        return result;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        /* TODO */
        //        if (that.data.length != data.length) {
//            return this;
//        }
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                data[i][j] -= that.data[i][j];
//            }
//        }
//        return this;

        if (data.length != that.data.length) {
            System.out.println("Invalid size!!!");
            return null;
        }
        SquareMatrix result = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result.data[i][j] = data[i][j] - that.get(i, j);
            }
        }
        return result;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        //        if (that.data.length != data.length) {
//            return this;
//        }
        //        return this
//        int[][] resultData = new int[data.length][data.length];
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                for (int k = 0; k < data.length; k++)
//                    resultData[i][j] += data[i][k] * that.data[k][j];
//            }
//        }
//        data = resultData;
//        return this;

        if (data.length != that.data.length) {
            System.out.println("Invalid size!!!");
            return null;
        }
        SquareMatrix result = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < data.length; k++) {
                    result.data[i][j] = result.data[i][j] + data[i][k] * that.get(k, j);
                }
            }
        }
        return result;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        //        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data.length; j++) {
//                data[i][j] *= value;
//            }
//        }
//        return this;

        SquareMatrix result = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result.data[i][j] = data[i][j] * value;
            }
        }
        return result;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     *
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        //        for (int i = 0; i < data.length - 1; i++) {
//            for (int j = i + 1; j < data.length; j++) {
//                int tmp = data[i][j];
//                data[i][j] = data[j][i];
//                data[j][i] = tmp;
//            }
//        }
//        return this;

        SquareMatrix result = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result.data[i][j] = data[j][i];
                result.data[j][i] = data[i][j];
            }
        }
        return result;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result += data[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
