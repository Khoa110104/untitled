package oop.lab.lab10.strategypattern.refactor;


public class MyPayStrategy {
    private static volatile MyPayStrategy instance;

    private PayStrategy payStrategy;

    private MyPayStrategy() {

    }

    public static MyPayStrategy getInstance() {
        if (instance==null) {
            synchronized (MyPayStrategy.class) {

                if (instance == null) {
                    instance = new MyPayStrategy();
                }
            }
        }
        return instance;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
