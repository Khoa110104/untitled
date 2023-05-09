package oop.lab.lab6.ex2_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(99, "Blue");
        System.out.println(circle1);

        circle1.setRadius(12);
        circle1.setColor("Green");
        System.out.println("radius = " + circle1.getRadius());
        System.out.println("color is: " + circle1.getColor());
        System.out.println("area is: " + circle1.getArea());

        Cylinder cylinder1 = new Cylinder(circle1, 6);
        System.out.println(cylinder1);

        cylinder1.setHeight(5);
        System.out.println("height is: " + cylinder1.getHeight());
        System.out.println("area of cylinder is: " + cylinder1.getArea());
        System.out.println("volume is: " + cylinder1.getVolume());
        System.out.println();
    }
}
