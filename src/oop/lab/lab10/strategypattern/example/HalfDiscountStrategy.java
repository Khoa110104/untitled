package oop.lab.lab10.strategypattern.example;

public class HalfDiscountStrategy implements PromoteStrategy {
    @Override
    public double doDiscount(double price) {
        return price * 0.5;
    }
}
