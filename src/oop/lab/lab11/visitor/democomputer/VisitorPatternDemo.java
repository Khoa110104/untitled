package oop.lab.lab11.visitor.democomputer;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{ new Monitor(), new Mouse(), new Keyboard(), new Mouse()};

        ComputerPart computer = new Computer(computerParts);
        computer.accept(new ComputerPartDisplayVisitor());
    }
}