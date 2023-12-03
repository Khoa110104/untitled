package oop.lab.lab10.decoratorpattern.icecreamdecorator;

public class ChocolateIceCream implements IceCream {
    @Override
    public String getDescription() {
        return description + " chocolate";
    }
}
