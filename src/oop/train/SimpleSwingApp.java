package oop.train;
import javax.swing.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        System.out.println("Chương trình đang chạy...");
        JFrame frame = new JFrame("Simple Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
