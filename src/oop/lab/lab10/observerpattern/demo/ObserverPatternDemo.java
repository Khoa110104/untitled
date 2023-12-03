package oop.lab.lab10.observerpattern.demo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("-----------With 100 To-------------");
        System.out.println("Change: 100");
        subject.setState(100);

        System.out.println("-----------With 19 To-------------");
        System.out.println("Change: 19");
        subject.setState(19);

        System.out.println("------------With 5 To------------");
        System.out.println("Change: 5");
        subject.setState(5);
    }
}
