package oop.tuan.lab11.strategy.pseudocode;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public long execute(long a, long b) {
        return a - b;
    }
}
