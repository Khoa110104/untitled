package oop.lab.lab11.abstractfactory.example;

public class TestMain {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("8 GB", "512 GB", "2.44 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.8 GHz"));
        System.out.println("PC Config::" + pc);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Server Config::" + server);
    }
}