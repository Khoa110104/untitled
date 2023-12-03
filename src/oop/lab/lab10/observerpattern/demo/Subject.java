package oop.lab.lab10.observerpattern.demo;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers;
    private int state;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
