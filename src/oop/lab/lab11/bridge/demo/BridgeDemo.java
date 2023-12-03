package oop.lab.lab11.bridge.demo;

public class BridgeDemo {
    public static void main(String[] args) {
        Computer myComputer = new PC(new MacOS());
        myComputer.startup();
        myComputer.browseInternet("https://www.facebook.com/profile.php?id=100057464244194");

        System.out.println("******************************************************************");
        Computer computer = new Laptop(new WindowsOS());
        computer.startup();
        computer.browseInternet("https://classroom.google.com/w/NTk0Mzc0Mzc3OTI4/t/all");
        if (computer.canMoveComputer()){
            System.out.println("Move to another place");
        }
    }
}