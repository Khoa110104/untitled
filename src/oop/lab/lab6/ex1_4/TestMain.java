package oop.lab.lab6.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        Shape shape1 = new Shape();
        System.out.println(shape1);

        //BasicStatistics getter and setter
        shape1.setColor("green");
        System.out.println("color is: " + shape1.getColor());

        //BasicStatistics constructor and toString()
        Circle circle1 = new Circle(5.5, "blue", false);
        System.out.println(circle1);

        //BasicStatistics getter and setter
        circle1.setColor("green");
        circle1.setRadius(2);
        System.out.println("area is: " + circle1.getArea());
        System.out.println("color is: " + circle1.getColor());
        System.out.println(circle1);

        //BasicStatistics constructor and toString()
        Rectangle rectangle1 = new Rectangle(7, 8);
        System.out.println(rectangle1);

        //BasicStatistics getter and setter
        rectangle1.setLength(3);
        rectangle1.setFilled(false);
        rectangle1.setColor("Black");
        System.out.println("area is:" + rectangle1.getArea());
        System.out.println("color is: " + rectangle1.getColor());
        System.out.println(rectangle1);

        //BasicStatistics constructor and toString()
        Square square1 = new Square();
        System.out.println(square1);

        //BasicStatistics getter and setter
        square1.setColor("blue");
        square1.setSide(49);
        System.out.println("color is: " + square1.getColor());
        System.out.println("area is:" + square1.getArea());
        System.out.println();
    }
}
