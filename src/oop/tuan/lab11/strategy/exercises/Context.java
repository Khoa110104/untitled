package oop.tuan.lab11.strategy.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Context {
    private PayStrategy strategy;
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
     private int paymentAmount;

    public Context() {
    }

    public Context(PayStrategy strategy, int paymentAmount) {
        this.strategy = strategy;
        this.paymentAmount = paymentAmount;
    }

    public PayStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public BufferedReader getREADER() {
        return READER;
    }
    public boolean pay(int paymentAmount){
       return strategy.pay(paymentAmount);
    }
    public void collectPaymentDetails() {
        strategy.collectPaymentDetails();
    }
}
