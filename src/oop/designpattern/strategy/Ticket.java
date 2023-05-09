package oop.designpattern.strategy;

public class Ticket {
    private double price;
    private PromoteStrategy promoteStrategy ;
    private String name;

    public Ticket() {
    }

    public Ticket(double price, PromoteStrategy promoteStrategy, String name) {
        this.price = price;
        this.promoteStrategy = promoteStrategy;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPromotedPrice() {
        return promoteStrategy.doDiscount(price);
    }
}
