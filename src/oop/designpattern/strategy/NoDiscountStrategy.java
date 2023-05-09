package oop.designpattern.strategy;

public class NoDiscountStrategy implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price;
    }
}
