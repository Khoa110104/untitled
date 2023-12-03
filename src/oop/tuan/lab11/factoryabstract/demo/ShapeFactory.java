package oop.tuan.lab11.factoryabstract.demo;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeShape) {
        if (typeShape.equals("Rectangle")) {
            return new Rectangle();
        } else if (typeShape.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
