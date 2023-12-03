package train.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayWithGeneric<T> {
    private ArrayList<T> arrayList;

    public ArrayWithGeneric(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void set(int ind, T value) {
        arrayList.add(ind, value);
    }

    public T get(int ind) {
        return arrayList.get(ind);
    }

    public T[] toArray(T[] array) {
        return arrayList.toArray(array);
    }

    public static void main(String[] args) {
        ArrayWithGeneric<Double> doubleArray = new ArrayWithGeneric<>(6);

        for (int i = 0; i < 6; i++) {
            doubleArray.set(i, (i + 1.4));
        }

        Double[] doubleResult = new Double[doubleArray.arrayList.size()];
        doubleResult = doubleArray.toArray(doubleResult);
        System.out.println("Double ArrayWithGeneric is: ");
        System.out.println(Arrays.toString(doubleResult));

        ArrayWithGeneric<String> stringArray = new ArrayWithGeneric<>(3);

        stringArray.set(0, "Hello");
        stringArray.set(1, "K67A4");
        stringArray.set(2, "!!!!");

        String[] stringResult = new String[stringArray.arrayList.size()];
        stringResult = stringArray.toArray(stringResult);
        System.out.println("String ArrayWithGeneric is: ");
        System.out.println(Arrays.toString(stringResult));
    }
}