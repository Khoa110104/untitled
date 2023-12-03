package oop.tuan.lab11.strategy.exercises;

public class Order {
    private  int totalCost = 0;
    private boolean isClosed = false;

    public  void processOrderUsingPayPal(PayByPayPal payPal) {
        payPal.collectPaymentDetails();
    }
    public void processOrderUsingCreditCard (PayByCreditCard creditCard) {
        creditCard.collectPaymentDetails();
    }
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }
    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
