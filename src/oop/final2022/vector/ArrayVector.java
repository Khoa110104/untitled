package oop.final2022.vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
        data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        /* TODO */
        data = coefficients;
        length = coefficients.length;
    }

    /*
     * Hàm tăng số phần tử của mảng lên gấp đôi.
     * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
     * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
     * sau đó copy những phần tử của mảng cũ sang mảng mới.
     */
    private void extend() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
    }

    /*
     * Hàm thêm một phần tử vào cuối vector.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void append(double value) {
        /* TODO */
        if (length == data.length) {
            extend();
        }
        data[length++] = value;
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 || index > length) {
            System.out.println("Can't insert!!!");
            return;
        }
        if (index == data.length) {
            extend();
        }
        for (int i = length; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        length++;
    }

    /*
     * Hàm xóa một phần tử của vector ở vị trí index.
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >=length) {
            System.out.println("Can't remove!!!");
            return;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    @Override
    public int length() {
        /* TODO */
        return length;
    }

    @Override
    public double magnitude() {
        /* TODO */
        double result = 0;
        for (int i = 0; i < length(); i++) {
            result += element(i) * element(i);
        }
        return Math.sqrt(result);
    }

    public double distanceTo(ArrayVector another) {
        /* TODO */
        if (length != another.length) {
            return 0;
        }
        double d = 0;
        for (int i = 0; i < length; i++) {
            d += Math.pow(element(i) - another.element(i), 2);
        }
        return Math.sqrt(d);
    }


    @Override
    public double[] elements() {
        /* TODO */
        return data = Arrays.copyOf(data, data.length);
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (index<0|| index>= length) {
            return 0;
        }
        return data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        /* TODO */
        if (length != another.length) {
            return new ArrayVector();
        }
        double[] result = new double[length+1];
        for (int i = 0 ; i < result.length; i++) {
            result[i] = data[i] - another.element(i);
        }
        return new ArrayVector(result);
    }

    public ArrayVector plus(ArrayVector another) {
        /* TODO */
        if (length != another.length) {
            return new ArrayVector();
        }
        double[] result = new double[length+1];
        for (int i = 0 ; i < result.length; i++) {
            result[i] = data[i] + another.element(i);
        }
        return new ArrayVector(result);
    }

    public ArrayVector scale(double factor) {
        /* TODO */
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[i] * factor;
        }
        return new ArrayVector(result);
    }

    public double dot(ArrayVector another) {
        /* TODO */
        if (length != another.length) {
            return 0;
        }
        double d = 0;
        for (int i = 0; i < length; i++) {
            d += element(i) * another.element(i);
        }
        return d;
    }



    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        return Arrays.toString(elements());
    }
}
