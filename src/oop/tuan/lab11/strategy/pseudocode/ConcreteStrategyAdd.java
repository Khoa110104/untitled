package oop.tuan.lab11.strategy.pseudocode;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public long execute(long a, long b) {
        return a + b;
    }
}
