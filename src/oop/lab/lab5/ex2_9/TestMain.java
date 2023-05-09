package oop.lab.lab5.ex2_9;

public class TestMain {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(1, 3);
        MyPoint v2 = new MyPoint(-4, -3);
        MyPoint v3 = new MyPoint(9, -6);

        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle1);

        System.out.println("perimeter: " + triangle1.getPerimeter());

        System.out.println("type is: " + triangle1.getType());

        MyTriangle myTriangle2 = new MyTriangle(1, 2, 3, 4, 5, 6);
        System.out.println(myTriangle2);
        System.out.println("perimeter: " + myTriangle2.getPerimeter());

        System.out.println("type: " + myTriangle2.getType());

    }
}
