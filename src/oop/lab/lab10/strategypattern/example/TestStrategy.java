package oop.lab.lab10.strategypattern.example;

public class TestStrategy {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(20,"Rice");
        ticket.setPrice(50);
        System.out.println("Name: " + ticket.getName());
        System.out.println("Product price: " + ticket.getPrice());

        ticket.setPromoteStrategy(new HalfDiscountStrategy());
        System.out.println("Sale 50%: "+ticket.getPromotedPrice());

        ticket.setPromoteStrategy(new NoDiscountStrategy());
        System.out.println("No discount: "+ticket.getPromotedPrice());

        ticket.setPromoteStrategy(new QuarterDiscountStrategy());

        System.out.println("Sale 75%: " + ticket.getPromotedPrice());
//        Ticket ticket1 = new Ticket(99, new HalfDiscountStrategy(), "Chocolate");
//        System.out.println(ticket1.getPromotedPrice());
    }
}
