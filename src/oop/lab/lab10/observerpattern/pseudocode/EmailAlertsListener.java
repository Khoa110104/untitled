package oop.lab.lab10.observerpattern.pseudocode;

public class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String newMessage = message.replace("%s", filename);
        System.out.println("Email to " + email + ": \"" + newMessage + "\"");
    }
}
