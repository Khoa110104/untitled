package oop.lab.lab11.factorymethod.demo;

import java.util.Scanner;

public class CallingClass {
    public static void main(String[] args) {
        try {
            FruitFactory factory = new FruitFactory();
            Scanner sc = new Scanner(System.in);
//            String type = sc.nextLine();
//            Fruit fruit = factory.provideFruit(type);
            Fruit fruit = factory.provideFruit("apple");
            fruit.produceJuice();
            System.out.println("-----------------------------");
            fruit = factory.provideFruit("orange");
            fruit.produceJuice();
            System.out.println("-----------------------------");
            fruit = factory.provideFruit("banana");
            fruit.produceJuice();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
