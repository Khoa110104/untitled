package oop.lab.lab6.ex2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(1, 3, 5, 7);
        System.out.println(lineSub1);

        lineSub1.setBeginX(99);
        lineSub1.setEndX(22);
        System.out.println("beginX is: " + lineSub1.getBeginX());
        System.out.println("endY is: " + lineSub1.getEndX());
        System.out.println("length is: " + lineSub1.getLength());
        System.out.println(lineSub1);
    }
}
