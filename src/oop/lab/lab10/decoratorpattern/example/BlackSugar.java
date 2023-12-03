package oop.lab.lab10.decoratorpattern.example;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", black sugar";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 15;
    }
}
