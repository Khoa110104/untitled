package oop.designpattern.observer;

public class PhoneNotifier extends Observer {
    public Subject subject;

    public PhoneNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public void Notify(Subject subject, Object object) {
        if (subject instanceof VideoData) {
            System.out.printf("Notify all subscribes via Phone with new data, name: %s, description: %s, fileName: %s", ((VideoData) subject).getTitle(), ((VideoData) subject).getDescription(), ((VideoData) subject).getFileName());
            System.out.println();
        }
    }
}
