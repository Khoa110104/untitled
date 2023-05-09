package oop.tuan.lab5.ex1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of "
                + circle1.getRadius() + " and are of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());

        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());

        System.out.println(circle4);
        //System.out.println(circle4.setRadius(4.4));
    }
}
