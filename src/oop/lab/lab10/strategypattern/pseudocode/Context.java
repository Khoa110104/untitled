package oop.lab.lab10.strategypattern.pseudocode;

public class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    long executeStrategy(long a, long b) {
        return strategy.execute(a, b);
    }
}
