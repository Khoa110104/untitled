package oop.lab.lab1;

public class CheckPassFail {
    public static void main(String[] args) {
        checkPassFail(5);
    }

    public static void checkPassFail(int mark) {
        System.out.println("The mark is " + mark);
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

}
