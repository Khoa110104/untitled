package oop.lab.lab11.visitor.demobook;

public class BusinessBook implements Book {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Business book";
    }
}