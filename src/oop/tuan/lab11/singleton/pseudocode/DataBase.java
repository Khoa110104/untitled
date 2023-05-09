package oop.tuan.lab11.singleton.pseudocode;

public class DataBase {
    private static volatile DataBase instance;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new DataBase();
                }
            }
        }
        return instance;
    }

    public void query(String spl) {
        System.out.println("Execute: " + spl);
    }
}
