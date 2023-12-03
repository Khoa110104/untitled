package oop.lab.lab11.abstractfactory.demo;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        return null;
    }
}