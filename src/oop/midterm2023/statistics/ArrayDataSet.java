package oop.midterm2023.statistics;

import java.util.Arrays;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            return -1;
        }
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        if (from < 0 || from >= to || to > size()) {
            return new double[0];
        }
        return Arrays.copyOfRange(data, from, to);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        insert(value, size());
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > size()) {
            System.out.println("Can't insert value at index " + index + "!");
            return;
        }
        if (size() == data.length) {
            enlarge();
        }
        for (int i = size(); i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            System.out.println("Can't remove element at index " + index + "!");
            return;
        }
        for (int i = index; i < size(); i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     *
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        int index = 0;
        while (index < size()) {
            if (index == value) {
                remove(index);
            } else {
                index++;
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
    }
}
