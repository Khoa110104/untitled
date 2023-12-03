package oop.final3.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPoly {
    List<Poly> polyList;

    public TestPoly() {
        polyList = new ArrayList<>();
    }

    public static ArrayPoly createArrayPoly(int[] arr) {
        return new ArrayPoly(arr);
    }

    public static ListPoly createListPoly(int[] arr) {
        return new ListPoly(arr);
    }

    public static int[] createRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static void main(String[] args) {
        TestPoly testPoly = new TestPoly();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            testPoly.polyList.add(new ArrayPoly(createRandomArray(random.nextInt(5) + 3)));
        }
        for (int i = 0; i < 5; i++) {
            testPoly.polyList.add(new ListPoly(createRandomArray(random.nextInt(5) + 3)));
        }
        for (Poly poly : testPoly.polyList) {
            System.out.println(poly);
            System.out.println(poly.derivative());
            int x = random.nextInt(4) + 1;
            System.out.println(x);
            System.out.println(poly.evaluate(x));
            if (poly instanceof ArrayPoly) {
                System.out.println(((ArrayPoly) poly).type());
            } else {
                System.out.println(((ListPoly) poly).type());
            }
        }

        System.out.println("==============================");
        ArrayPoly arrayPoly1 = new ArrayPoly(new int[]{1, 2, 3});
        ArrayPoly arrayPoly2 = new ArrayPoly(new int[]{4, 5, 6});
        System.out.println(arrayPoly1.minus(arrayPoly2));
        System.out.println(arrayPoly1.plus(arrayPoly2));
        System.out.println(arrayPoly1.times(arrayPoly2));

        System.out.println("==============================");
        ListPoly listPoly1 = new ListPoly(new int[]{1, 2, 3});
        ListPoly listPoly2 = new ListPoly(new int[]{4, 5, 6});
        System.out.println(listPoly1.minus(listPoly2));
        System.out.println(listPoly1.plus(listPoly2));
        System.out.println(listPoly1.times(listPoly2));
    }
}
