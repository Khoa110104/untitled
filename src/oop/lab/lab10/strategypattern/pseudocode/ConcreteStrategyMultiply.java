package oop.lab.lab10.strategypattern.pseudocode;

public class ConcreteStrategyMultiply  implements Strategy {
    @Override
    public long execute(long a, long b) {
        return a*b;
    }
}
