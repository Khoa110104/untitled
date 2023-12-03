package oop.tuan.lab11.factoryabstract.demo;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("--------------RUN---------------");
        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);
        Shape shape = abstractFactory.getShape("Square");
        shape.draw();
        System.out.println("------------------------------------------");
        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.draw();

        System.out.println("------------------------------------------");

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(false);
        Shape shape2 = abstractFactory1.getShape("Rectangle");
        shape1.draw();

        System.out.println("------------------------------------------");

        Shape shape3 = abstractFactory1.getShape("Square");
        shape3.draw();
    }
}
