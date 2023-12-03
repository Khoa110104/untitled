package oop.lab.lab7.ex1_3;

public class TestMain {
    public static void main(String[] args) {
        //BasicStatistics constructor and toString()
        Movable point1 = new MovablePoint(1, 4, 7, 4);
        System.out.println(point1);

        //BasicStatistics moveUp()-moveDown()-moveLeft()-moveRight
        System.out.println("before moving up, y=" + ((MovablePoint) point1).y);
        point1.moveUp();
        System.out.println("after, y=" + ((MovablePoint) point1).y);

        System.out.println("before moving down, y=" + ((MovablePoint) point1).y);
        point1.moveDown();
        System.out.println("after, y=" + ((MovablePoint) point1).y);

        System.out.println("before moving left, x=" + ((MovablePoint) point1).x);
        point1.moveLeft();
        System.out.println("after, y=" + ((MovablePoint) point1).x);

        System.out.println("before moving right, x=" + ((MovablePoint) point1).x);
        point1.moveRight();
        System.out.println("after, x=" + ((MovablePoint) point1).x);
    }
}
