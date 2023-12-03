package train.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Array<T> {
    private ArrayList<T> list;

    public Array(int size) {
        list = new ArrayList<>(size);
    }

    public void set(int index, T value) {
        list.add(index, value);
    }

    public T get(int index) {
        return list.get(index);
    }

    public T[] toArray(T[] array) {
        return list.toArray(array);
    }

    public static void main(String[] args) {
        // Tạo một mảng generics với kiểu dữ liệu Double
        Array<Double> doubleArray = new Array<>(5);

        // Thiết lập các giá trị trong mảng
        for (int i = 0; i < 5; i++) {
            doubleArray.set(i, (i * 1.5));
        }

        // Lấy và in ra các giá trị từ mảng
        Double[] doubleResult = new Double[doubleArray.list.size() ];
        doubleResult = doubleArray.toArray(doubleResult);
        System.out.println("Double ArrayWithGeneric:");
        System.out.println(Arrays.toString(doubleResult));

        // Tạo một mảng generics với kiểu dữ liệu String
        Array<String> stringArray = new Array<>(3);

        // Thiết lập các giá trị trong mảng
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        stringArray.set(2, "!");

        // Lấy và in ra các giá trị từ mảng
        String[] stringResult = new String[stringArray.list.size()];
        stringResult = stringArray.toArray(stringResult);
        System.out.println("String ArrayWithGeneric:");
        System.out.println(Arrays.toString(stringResult));
    }
}