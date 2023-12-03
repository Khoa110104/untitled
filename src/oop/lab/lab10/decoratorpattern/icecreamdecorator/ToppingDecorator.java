package oop.lab.lab10.decoratorpattern.icecreamdecorator;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public abstract String getDescription();

    public abstract String addTopping();
}
