package oop.lab.lab10.singletonpattern.demosingleton;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        System.out.println(boiler);
        System.out.println("---------------------------------------");

        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        System.out.println(boiler1);

        System.out.println("---------------------------------------");
        System.out.println(boiler==boiler1);
    }
}
