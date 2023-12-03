package oop.lab.lab10.singletonpattern.example;

public class MyDadSingleton {
    private static MyDadSingleton instance;

    private MyDadSingleton() {
    }

    public static MyDadSingleton getInstance() {
        if (instance == null) {
            instance = new MyDadSingleton();
        }
        return instance;
    }

    public void introduce() {
        System.out.println("Hello i'm Khoa's father");
    }

}
