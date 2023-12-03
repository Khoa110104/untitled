package oop.lab.lab11.command.example;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account -" + name + "- opened");
    }

    public void close() {
        System.out.println("Account -" + name + "- Closed");
    }
}