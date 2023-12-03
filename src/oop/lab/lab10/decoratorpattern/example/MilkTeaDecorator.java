package oop.lab.lab10.decoratorpattern.example;

public abstract class MilkTeaDecorator extends MilkTea {
    MilkTea milkTea;

    public abstract String getDescription();

    public abstract double cost();
}
