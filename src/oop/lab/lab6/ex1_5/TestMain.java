package oop.lab.lab6.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        //Test constructor and toString()
        Animal animal1 = new Animal("Dog");
        System.out.println(animal1);

        Mammal mammal = new Mammal("Khoa");
        System.out.println(mammal);

        Cat cat1 = new Cat("Lam");
        cat1.greets();

        Dog dog1 = new Dog("Long");
        dog1.greets();
        dog1.greets(dog1);
    }
}
