package oop.lab.lab10.singletonpattern.example;

public class TestSingleton {
    public static void main(String[] args) {
        MyDadSingleton myDadSingleton1 = MyDadSingleton.getInstance();
        myDadSingleton1.introduce();
        MyDadSingleton myDadSingleton2 = MyDadSingleton.getInstance();

        System.out.println(myDadSingleton1==myDadSingleton2);
    }
}
