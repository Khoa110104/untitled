package oop.designpattern.decorater;

public abstract class MilkTeaDecorator extends MilkTea {
    MilkTea milkTea;

    public abstract String getDescription();

    public abstract double cost();
}
