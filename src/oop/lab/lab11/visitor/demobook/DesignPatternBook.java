package oop.lab.lab11.visitor.demobook;

public class DesignPatternBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://github.com/Khoa110104/untitled.git";
    }

    public String getBestSeller() {
        return "The best Seller book design pattern";
    }
}