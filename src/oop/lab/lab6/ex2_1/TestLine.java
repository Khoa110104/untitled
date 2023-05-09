package oop.lab.lab6.ex2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line = new Line(1, 3, 5, 7);
        System.out.println(line);

        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 6);
        Line line1 = new Line(point1, point2);
        System.out.println(line1);
        line1.setBeginX(99);
        System.out.println("beginX is: " + line1.getBeginX());
    }
}
