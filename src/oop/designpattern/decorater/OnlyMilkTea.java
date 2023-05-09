package oop.designpattern.decorater;

public class OnlyMilkTea extends MilkTea {
    public OnlyMilkTea() {
        description = "Milk tea";
    }
    @Override
    public double cost() {
        return 5;
    }
}
