package oop.lab.lab10.decoratorpattern.example;

public class Bubble extends MilkTeaDecorator {
    public Bubble(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", bubble";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 5;
    }
}
