package oop.tuan.lab11.factoryabstract.demo;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeShape) {
        if (typeShape.equals("Rectangle")) {
            return new RoundedRectangle();
        } else if (typeShape.equals("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
