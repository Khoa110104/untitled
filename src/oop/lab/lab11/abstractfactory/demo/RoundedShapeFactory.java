package oop.lab.lab11.abstractfactory.demo;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.RECTANGLE) {
            return new RoundedRectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new RoundedSquare();
        }
        return null;
    }
}