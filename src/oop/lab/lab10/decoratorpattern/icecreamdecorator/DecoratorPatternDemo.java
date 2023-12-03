package oop.lab.lab10.decoratorpattern.icecreamdecorator;

public class DecoratorPatternDemo {
    public static void main(String args[]) {
        IceCream iceCream = new HoneyToppingDecorator(new NutsToppingDecorator(new ChocolateIceCream()));
        System.out.println(iceCream.getDescription());
        System.out.println("--------------------------------------");
        IceCream iceCream1 = new NutsToppingDecorator(new VanillaIceCream());
        System.out.println(iceCream1.getDescription());
    }
}
