package oop.lab.lab6.ex2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
    }

    public Cylinder(Circle circle, double height) {
        this.base = circle;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI * 2 * base.getRadius() * height + 2 * base.getArea();
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
