package oop.lab.lab7.ex1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable point1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(point1);

        point1.moveLeft();
        point1.moveDown();
        System.out.println(point1);

        MovableRectangle rectangle = new MovableRectangle(6, 7, 89, 3, 5, 2);
        System.out.println(rectangle);


        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
