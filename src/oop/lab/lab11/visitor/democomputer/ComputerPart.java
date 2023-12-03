package oop.lab.lab11.visitor.democomputer;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}