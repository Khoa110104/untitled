package oop.designpattern.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> MyDadSingleton.getInstance().introduce());
        Thread thread2 = new Thread(() -> MyDadSingleton.getInstance().introduce());
        thread1.start();
        thread2.start();
    }
}
