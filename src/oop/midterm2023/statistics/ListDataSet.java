package oop.midterm2023.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            return -1;
        }
        return data.get(index);
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        if (from < 0 || from >= to || to > size()) {
            return new double[0];
        }
        double[] elements = new double[to - from];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = element(i + from);
        }
        return elements;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     *
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
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
        data.add(index, value);
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
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     *
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        data.removeIf(number -> number == value);
    }
}
