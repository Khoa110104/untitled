package oop.lab.lab10.observerpattern.diagram;

public class ConcreteSubject2 implements Subscriber {
    private Publisher publisher;

    public ConcreteSubject2(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void update(int data) {
        System.out.println("Updating concrete subject 2");
    }
}
