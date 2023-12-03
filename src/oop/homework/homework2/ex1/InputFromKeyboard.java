package oop.homework.homework2.ex1;

import java.util.Scanner;

public class InputFromKeyboard {
    public static int[] inputFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.print("Import elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
