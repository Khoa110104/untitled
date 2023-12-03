package oop.lab.lab7.ex1_5;

public class TestCircle {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        GeometricObject shape1 = new Circle(9);
        System.out.println(shape1);

        //BasicStatistics getArea() and getPerimeter()
        System.out.println("area = " + shape1.getArea());
        System.out.println("perimeter = " + shape1.getPerimeter());
    }
}
