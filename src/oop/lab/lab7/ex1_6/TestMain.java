package oop.lab.lab7.ex1_6;

public class TestMain {
    public static void main(String[] args) {
        //Test constructor and toString()
        Animal cat = new Cat("dd");
        System.out.println(cat);

        Animal dog = new Dog("djwi");
        System.out.println(dog);

        Animal bigDog = new BigDog("haha");
        System.out.println(bigDog);

        //Test greets()
        cat.greets();
        dog.greets();
        bigDog.greets();
    }
}
