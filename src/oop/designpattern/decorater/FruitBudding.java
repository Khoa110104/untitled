package oop.designpattern.decorater;

public class FruitBudding extends MilkTeaDecorator{
    public FruitBudding(MilkTea milkTea){
        this.milkTea = milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", fruit budding";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 6;
    }
}
