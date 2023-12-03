package oop.lab.lab11.visitor.demobook;

public class VisitorPatternExample {

    public static void main(String[] args) throws Exception {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();

        Visitor v = new VisitorImpl();
        book1.accept(v);
        System.out.println("***************************************************\n");
        book2.accept(v);
        System.out.println("***************************************************\n");
        book3.accept(v);
    }
}