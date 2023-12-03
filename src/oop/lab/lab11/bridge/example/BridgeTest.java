package oop.lab.lab11.bridge.example;

public class BridgeTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(1, 3, 5, new RedCircle());
        Shape greenCircle = new Circle(2, 4, 6, new GreenCircle());

        redCircle.draw();
        System.out.println("----------------------------------------------------");
        greenCircle.draw();
    }
}
