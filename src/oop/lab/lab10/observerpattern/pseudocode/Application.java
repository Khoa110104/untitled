package oop.lab.lab10.observerpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LoggingListener logger = new LoggingListener("khoa.txt", "Someone has opened the file: %s");
        EmailAlertsListener email = new EmailAlertsListener("fhaiufh@example.com", "The file has been opened: %s");
        editor.events.subscribe("open", logger);
        editor.events.subscribe("open", email);

        LoggingListener loggingListener = new LoggingListener("faihfaf.txt", "someone save your file");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("gaesgge@example.com", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);
        editor.events.subscribe("save", loggingListener);

        editor.openFile("test.txt");
        editor.events.unsubscribe("open", logger);
        editor.openFile("kkkk.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}