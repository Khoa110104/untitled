package oop.lab.lab10.observerpattern.diagram;


import java.util.LinkedList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscribers;
    protected int mainState;

    public Publisher() {
        subscribers = new LinkedList<>();
        this.mainState = 0;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.mainState);
        }
    }

    public void mainBusinessLogic() {
        System.out.println("Do something");
    }

    public void changeData(int data) {
        if (this.mainState == data) {
            return;
        }
        this.mainState = data;
        stateChanged();
    }

    public void stateChanged() {
        notifySubscribers();
    }
}
