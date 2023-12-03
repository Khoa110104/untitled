package oop.lab.lab10.adapterpattern.example2;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack quack...");
    }

    @Override
    public void fly() {
        System.out.println("Fly...");
    }
}