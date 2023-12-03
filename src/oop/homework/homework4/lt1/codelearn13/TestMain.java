package oop.homework.homework4.lt1.codelearn13;

import homework.homework4.lt1.codelearn13.Reverse;

public class TestMain {
    public static void main(String[] args) {
        homework.homework4.lt1.codelearn13.Reverse reverse = new Reverse();
        String string1 = "123456789";
        String string2 = "abcd";

        System.out.print(string1 + " after reverse: ");
        reverse.reverse(string1);
        System.out.print(string2 + " after reverse: ");
        reverse.reverse(string2);

    }
}
