package oop.lab.lab10.observerpattern.pseudocode;

import java.io.File;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        log = new File(log_filename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("Write to " + log.getName() + ": \"" + newMessage + "\"");
    }
}
