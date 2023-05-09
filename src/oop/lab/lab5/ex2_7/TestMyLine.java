package oop.lab.lab5.ex2_7;


public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);
        MyLine line = new MyLine(begin, end);
        System.out.println(line);

        line.setBeginXY(5, 5);
        line.setEndXY(9, 9);
        System.out.println(line);

        System.out.println("length: " + line.getLength());

        System.out.println("gradient: " + line.getGradient());
    }
}
