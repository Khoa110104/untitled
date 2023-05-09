package oop.lab.lab5.ex2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);
        MyCircle circle = new MyCircle(point2, 8);
        System.out.println(circle);

        circle.setRadius(4);
        System.out.println("radius: " + circle.getRadius());


        circle.setCenter(new MyPoint(5, 5));
        System.out.println(point2);

        circle.setCenterX(1);
        circle.setCenterY(6);
        System.out.println("x: " + circle.getCenterX());
        System.out.println("y: " + circle.getCenterY());

        System.out.println("area: " + circle.getArea());
        System.out.println("circumference: " + circle.getCircumference());

        circle.setCenterXY(4, 9);
        System.out.println(circle);

    }
}
