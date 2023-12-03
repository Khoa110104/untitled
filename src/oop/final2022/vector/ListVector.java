package oop.final2022.vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > data.size()) {
            System.out.println("Can't insert!!!");
            return;
        }
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= length()) {
            System.out.println("Can't remove at index " + index);
            return;
        }
        data.remove(index);
    }


    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double result = 0;
        for (int i = 0; i < data.size(); i++) {
            result += data.get(i) * data.get(i);
        }
        return Math.sqrt(result);
    }

    public double distanceTo(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return 0;
        }
        double result = 0;
        for (int i = 0; i < length(); i++) {
            result += Math.pow(data.get(i) * another.element(i), 2);
        }
        return Math.sqrt(result);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] newData = new double[length()];
        for (int i = 0; i < length(); i++) {
            newData[i] = data.get(i);
        }
        return newData;
    }

    public double element(int index) {
        /* TODO */
        if (index < 0 || index >= data.size()) {
            return 0;
        }
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        if (data.size() != another.length()) {
            return new ListVector();
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            result.add(i, data.get(i) - another.element(i));
        }
        return new ListVector(result);
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        if (data.size() != another.length()) {
            return new ListVector();
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            result.add(i, data.get(i) + another.element(i));
        }
        return new ListVector(result);
    }

    public ListVector scale(double factor) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < length(); i++) {
            result.add(i, data.get(i) * factor);
        }
        return new ListVector(result);
    }

    public double dot(ListVector another) {
        /* TODO */
        if (length() != another.length()) {
            return 0;
        }
        double result = 0;
        for (int i = 0; i < length(); i++) {
            result+=data.get(i) * another.element(i);
        }
        return result;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        return data.toString();
    }
}
