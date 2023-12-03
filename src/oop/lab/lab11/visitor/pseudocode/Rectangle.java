//package oop.lab.lab11.visitor.pseudocode;
//
//import java.util.Random;
//
//public class Rectangle implements Shape {
//    private int id;
//    private int x;
//    private int y;
//
//    public Rectangle() {
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
//        System.out.println("Drawing Rectangle at (" + x + "," + y + ")");
//    }
//
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visitRectangle(this);
//    }
//
//}
