package oop.lab.lab11.abstractfactory.demo;

public class FactoryProducer {
    private static final AbstractFactory roundedShapeFactory = new RoundedShapeFactory();
    private static final AbstractFactory shapeFactory = new ShapeFactory();

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return roundedShapeFactory;
        } else {
            return shapeFactory;
        }
    }
}