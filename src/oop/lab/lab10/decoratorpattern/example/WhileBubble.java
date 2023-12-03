package oop.lab.lab10.decoratorpattern.example;

public class WhileBubble extends MilkTeaDecorator {
    public WhileBubble(MilkTea milkTea){
        this.milkTea = milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", while bubble";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 12;
    }
}
