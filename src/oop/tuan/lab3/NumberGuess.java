package oop.tuan.lab3;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess:");
        int guess = in.nextInt();
        int count = 1;
        while (SECRET_NUMBER != guess) {
            if (SECRET_NUMBER < guess) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
            guess = in.nextInt();
            count++;
        }
        System.out.println("You got it in " + count + " trials!");
    }
}
