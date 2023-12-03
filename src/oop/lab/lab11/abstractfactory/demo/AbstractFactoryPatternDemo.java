package oop.lab.lab11.abstractfactory.demo;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = getShape(true, ShapeType.RECTANGLE);
        shape1.draw();
        System.out.println("---------------------------------");
        Shape shape2 = getShape(false, ShapeType.SQUARE);
        shape2.draw();
        System.out.println("---------------------------------");
        Shape shape3 = getShape(false, ShapeType.RECTANGLE);
        shape3.draw();
        System.out.println("---------------------------------");
        Shape shape4 = getShape(true, ShapeType.SQUARE);
        shape4.draw();
    }

    private static Shape getShape(boolean isRound, ShapeType shapeType) {
        AbstractFactory factory = FactoryProducer.getFactory(isRound);
        return factory.getShape(shapeType);
    }
}