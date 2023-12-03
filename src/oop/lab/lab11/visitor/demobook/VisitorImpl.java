package oop.lab.lab11.visitor.demobook;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("BusinessBook");
        System.out.println("Publisher: " + book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Design Pattern Book");
        System.out.println("Source: " + book.getResource());
        System.out.println("Best Seller: " + book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("JavaCoreBook");
        System.out.println("Source: " + book.getResource());
        System.out.println("Favourite Book: " + book.getFavouriteBook());
    }
}
