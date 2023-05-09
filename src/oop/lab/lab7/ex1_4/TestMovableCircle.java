package oop.lab.lab7.ex1_4;

public class TestMovableCircle {
    public static void main(String[] args) {
        //Test constructor and toString()
        Movable point1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(point1);

        Movable circle1 = new MovableCircle(5, 1, 7, 4, 9);
        System.out.println("before, circle1 is: " + circle1);

        //Test move
        circle1.moveUp();
        circle1.moveRight();
        System.out.println("after, circle1 is: " + circle1);
    }
}
