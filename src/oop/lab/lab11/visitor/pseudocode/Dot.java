//package oop.lab.lab11.visitor.pseudocode;
//
//import java.util.Random;
//
//public class Dot implements Shape {
//    private int id;
//    private int x;
//    private int y;
//
//    public Dot() {
//        this.id = new Random().nextInt(100);
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    @Override
//    public void move(int x, int y) {
//        this.x += x;
//        this.y += y;
//        draw();
//    }
//
//    @Override
//    public void draw() {
//        System.out.println("Drawing Dot at (" + x + "," + y + ")");
//    }
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visitDot(this);
//    }
//
//}
//
