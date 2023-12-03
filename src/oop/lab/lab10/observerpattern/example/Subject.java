package oop.lab.lab10.observerpattern.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyObserver(Subject subject, Object object) {
        for (Observer observer :observerList) {
            observer.Notify(subject, object);
        }
    }
}
