package oop.lab.lab10.decoratorpattern.icecreamdecorator;

public class StrawberryIceCream implements IceCream {
    @Override
    public String getDescription() {
        return description + " strawberry";
    }
}
