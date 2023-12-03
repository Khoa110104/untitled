package oop.lab.lab11.visitor.demobook;

public interface Visitor {

    void visit(BusinessBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);
}