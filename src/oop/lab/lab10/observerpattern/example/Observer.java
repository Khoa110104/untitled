package oop.lab.lab10.observerpattern.example;

public abstract class Observer {
    protected Subject subject;
    public abstract void Notify(Subject subject, Object object);
}
