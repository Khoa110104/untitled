package oop.tuan.lab11.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        DataBase foo = DataBase.getInstance();
        foo.query("SELECT FAM MU");

        DataBase bar = DataBase.getInstance();
        bar.query("SELECT FAN MC");
    }
}
