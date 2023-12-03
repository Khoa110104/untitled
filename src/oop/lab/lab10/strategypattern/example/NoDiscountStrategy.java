package oop.lab.lab10.strategypattern.example;

public class NoDiscountStrategy implements PromoteStrategy {
    @Override
    public double doDiscount(double price) {
        return price;
    }
}
