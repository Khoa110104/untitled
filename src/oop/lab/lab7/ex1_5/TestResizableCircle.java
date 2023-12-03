package oop.lab.lab7.ex1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        Resizable shape1 = new ResizableCircle(5);
        System.out.println(shape1);

        //BasicStatistics getArea()
        System.out.println("area = " + ((Circle) shape1).getArea());

        //BasicStatistics resize()
        shape1.resize(75);
        System.out.println("After resizing radius is: " + ((Circle) shape1).radius);
    }
}
