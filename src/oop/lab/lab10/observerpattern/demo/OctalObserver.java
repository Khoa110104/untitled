package oop.lab.lab10.observerpattern.demo;

public class OctalObserver extends Observer {
    protected Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string = " + Integer.toOctalString(subject.getState()));
    }
}
