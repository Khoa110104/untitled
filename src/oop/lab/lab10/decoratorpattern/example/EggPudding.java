package oop.lab.lab10.decoratorpattern.example;

public class EggPudding extends MilkTeaDecorator {

    public EggPudding(MilkTea milkTea) {
        this.milkTea= milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", egg pudding";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 4;
    }
}
