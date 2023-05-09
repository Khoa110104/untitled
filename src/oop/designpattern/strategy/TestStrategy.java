package oop.designpattern.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setPrice(50);
        System.out.println("price: " + ticket.getPrice());

        ticket.setPromoteStrategy(new HalfDiscountStrategy());
        System.out.println(ticket.getPromotedPrice());

        ticket.setPromoteStrategy(new NoDiscountStrategy());
        System.out.println(ticket.getPromotedPrice());

        ticket.setPromoteStrategy(new QuarterDiscountStrategy());
        System.out.println(ticket.getPromotedPrice());
    }
}
