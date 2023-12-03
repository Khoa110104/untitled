package oop.lab.lab10.strategypattern.refactor;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
