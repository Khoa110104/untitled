package oop.lab.lab11.visitor.demobook;

public interface Book {
    void accept(Visitor v);
}