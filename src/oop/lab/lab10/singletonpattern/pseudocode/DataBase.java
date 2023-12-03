package oop.lab.lab10.singletonpattern.pseudocode;

public class DataBase {
    private static DataBase instance;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void query(String spl) {
        System.out.println("spl: " + spl);
    }
}
