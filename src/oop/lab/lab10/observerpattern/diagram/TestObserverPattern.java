package oop.lab.lab10.observerpattern.diagram;

public class TestObserverPattern {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        ConcreteSubject1 concreteSubject1 = new ConcreteSubject1(publisher);
        ConcreteSubject2 concreteSubject2 = new ConcreteSubject2(publisher);
        ConcreteSubject3 concreteSubject3 = new ConcreteSubject3(publisher);

        publisher.changeData(1);
        System.out.println("---------------------------");
        publisher.changeData(2);
    }
}
