package oop.lab.lab11.command.pseudocode;


public class Button {
    private Action command;

    public void setCommand(Action command) {
        this.command = command;
    }

    public void onClick() {
        command.perform();
    }
}