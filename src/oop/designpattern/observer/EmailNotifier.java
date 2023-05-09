package oop.designpattern.observer;

public class EmailNotifier extends Observer {
    public Subject subject;
    public EmailNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void Notify(Subject subject, Object object) {
        if (subject instanceof VideoData) {
            System.out.printf("Notify all subscribes via Email with new data, name: %s, description: %s, fileName: %s", ((VideoData) subject).getTitle(), ((VideoData) subject).getDescription(), ((VideoData) subject).getFileName());
            System.out.println();
        }
    }
}
