package oop.homework.homework4.lt1.codelearn14;

import homework.homework4.lt1.codelearn14.ToBinary;

public class TestMain {
    public static void main(String[] args) {
        ToBinary toBinary = new ToBinary();
        System.out.print("3 to binary: ");
        toBinary.toBin(3);

        System.out.print("\n13 to binary: ");
        toBinary.toBin(13);

        System.out.print("\n10202 to binary: ");
        toBinary.toBin(10202);
    }
}
