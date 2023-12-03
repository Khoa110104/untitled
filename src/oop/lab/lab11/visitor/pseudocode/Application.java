//package oop.lab.lab11.visitor.pseudocode;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Application {
//    List<Shape> shapes;
//
//    public Application() {
//        shapes = new LinkedList<Shape>();
//        Dot dot = new Dot();
//        dot.move(10, 20);
//        shapes.add(dot);
//
//        Rectangle rect = new Rectangle();
//        rect.move(100, 0);
//        shapes.add(rect);
//
//        Circle circle = new Circle();
//        circle.move(234, 20);
//        shapes.add(circle);
//    }
//
//    public static void main(String[] args) {
//
//        Application client = new Application();
//        XMLExportVisitor exportVisitor = new XMLExportVisitor();
//        for (Shape shape : client.shapes) {
//            shape.accept(exportVisitor);
//        }
//    }
//
//}
