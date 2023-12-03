package oop.lab.lab10.singletonpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        DataBase foo = DataBase.getInstance();
        foo.query("SELECT FAM MU");

        System.out.println("------------------");
        DataBase bar = DataBase.getInstance();
        bar.query("SELECT FAN MC");
    }
}
