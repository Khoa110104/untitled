package oop.designpattern.singleton;

import java.util.Random;

public class MyDadSingleton {
    private int index;
    private static volatile MyDadSingleton instance;

    private MyDadSingleton(int index) {
        this.index = index;
    }
    public static MyDadSingleton getInstance() {
        if (instance==null) {
            synchronized (MyDadSingleton.class){
                if (instance==null) {
                    Random random = new Random();
                    int idx = random.nextInt(5);
                    instance = new MyDadSingleton(idx);
                }
            }
        }
        return instance;
    }
    public void introduce() {
        System.out.println("Hello i'm Khoa's father" + index);
    }

}
