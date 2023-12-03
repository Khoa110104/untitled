package oop.lab.lab11.visitor.democomputer;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts) {
        this.computerParts = computerParts;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

