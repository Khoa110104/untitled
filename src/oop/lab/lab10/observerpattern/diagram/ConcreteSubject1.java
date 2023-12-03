package oop.lab.lab10.observerpattern.diagram;

public class ConcreteSubject1 implements Subscriber {
    private Publisher publisher;

    public ConcreteSubject1(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void update(int data) {
        System.out.println("Updating concrete subject 1");
    }
}
