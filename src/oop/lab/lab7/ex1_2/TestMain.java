package oop.lab.lab7.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString() and getter
        GeometricObject shape1 = new Circle(2.2);
        System.out.println(shape1);
        System.out.println("shape1's area is: " + ((Circle) shape1).getArea());
        System.out.println("shape1's perimeter is: " + ((Circle) shape1).getPerimeter());

        GeometricObject shape2 = new Rectangle(3.3, 2.2);
        System.out.println(shape2);
        System.out.println("shape2's area is: " + ((Rectangle) shape2).getArea());
        System.out.println("shape2's perimeter is: " + ((Rectangle) shape2).getPerimeter());
    }
}
