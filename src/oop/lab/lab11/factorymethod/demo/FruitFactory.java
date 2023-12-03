package oop.lab.lab11.factorymethod.demo;

public class FruitFactory {
    Fruit provideFruit(String name) throws Exception {
        switch (name) {
            case "apple":
                return new Apple();
            case "orange":
                return new Orange();
            case "banana":
                return new Banana();
            default:
                throw new Exception("No matching fruit could be provided");
        }
    }
}