package oop.lab.lab10.decoratorpattern.shapedecorator;

public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    public ShapeDecorator() {
    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
